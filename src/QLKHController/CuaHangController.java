package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import App.*;
import java.util.ArrayList;
/**
 *
 * @author VTTDung
 */
public class CuaHangController {
    public static ArrayList<CuaHangModel> listCuaHang() {
        return CuaHangModel.getListCuaHang();
    }
    public static boolean doAddCuaHang(CuaHangModel ch){
        return (CuaHangModel.addCuaHang(ch));
    }
    public static boolean doDeleteCuaHang(CuaHangModel ch){
        return (CuaHangModel.deleteCuaHang(ch));
    }
     public static boolean doEditCuaHang(CuaHangModel ch){
        return (CuaHangModel.editCuaHang(ch));
    }
}