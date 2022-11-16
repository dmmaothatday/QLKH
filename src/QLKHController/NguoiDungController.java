/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class NguoiDungController {
    private static DangNhapForm dnview;
 
    public NguoiDungController(DangNhapForm view) {
        NguoiDungController.dnview = view;
    }
    
    public static void loginPage(){
        DangNhapForm.runLogin();
    }
    
    public void doLogin(){  
        NguoiDungModel user = DangNhapForm.getUserLogin();
        if (user.getMaND().equals("") || user.getMatKhau().equals("")){
            dnview.showMessageLogin("Vui lòng điền đầy đủ thông tin \n");
        } else {                            
            if(NguoiDungModel.checkLogin(user.getMaND(),user.getMatKhau())){
                String cv = NguoiDungModel.getChucVuLogin(user.getMaND(),user.getMatKhau());
                if(null != cv)switch (cv) {
                    case "Quản lý" -> indexFormQL.runIndexQL();
                    case "Nhân viên tiếp nhận" -> indexFormNVTN.runIndexNVTN();
                    case "Nhân viên kiểm kê" -> indexFormNVKK.runIndexNVKK();
                    default -> { DangNhapForm.runLogin();
                        }
                }
                dnview.dispose();
            } else dnview.showMessageLogin("Sai thông tin đăng nhập \n");
            
        }
    }
    
    public static ArrayList<NguoiDungModel> listNguoiDung() {
        return NguoiDungModel.getListNguoiDung();
    }
    
    public static boolean doAddNguoiDung(NguoiDungModel user){
        return (NguoiDungModel.addNguoiDung(user));
    }
    

}
