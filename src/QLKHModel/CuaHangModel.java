/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKHModel;
import QLKHController.*;
import QLKHView.*;
import App.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author trinh
 */
public class CuaHangModel{
    private String MaCH;
    private String TenCH;
    private String DiaChiCH;
    private String SdtCH;

    public CuaHangModel(String MaCH, String TenCH, String DiaChiCH, String SdtCH) {
        this.MaCH = MaCH;
        this.TenCH = TenCH;
        this.DiaChiCH = DiaChiCH;
        this.SdtCH = SdtCH;
    }

    public CuaHangModel() {
    }

    public String getMaCH() {
        return MaCH;
    }

    public void setMaCH(String MaCH) {
        this.MaCH = MaCH;
    }

    public String getTenCH() {
        return TenCH;
    }

    public void setTenCH(String TenCH) {
        this.TenCH = TenCH;
    }

    public String getDiaChiCH() {
        return DiaChiCH;
    }

    public void setDiaChiCH(String DiaChiCH) {
        this.DiaChiCH = DiaChiCH;
    }

    public String getSdtCH() {
        return SdtCH;
    }

    public void setSdtCH(String SdtCH) {
        this.SdtCH = SdtCH;
    }
    
    public static ArrayList<CuaHangModel> getListCuaHang() {
        Connection conn = BaseModel.getConnection();
        ArrayList<CuaHangModel> listCH = new ArrayList<>(); 
        try{
            String query = "select * from CuaHang"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                CuaHangModel ch = new CuaHangModel();
                
                ch.setMaCH(rs.getString(1));
                ch.setTenCH(rs.getString(2));
                ch.setSdtCH(rs.getString(3));
                ch.setDiaChiCH(rs.getString(4));
                
                listCH.add(ch); 
            }
            return listCH;  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCH;  
    }
    
    
    public static boolean addCuaHang(CuaHangModel ch) {
        Connection conn = BaseModel.getConnection();
        try {
            String query = " INSERT INTO CuaHang(ma_cua_hang,ten_cua_hang,sdt,dia_chi) VALUES('" 
                    + ch.getMaCH() + "','" 
                    + ch.getTenCH() + "','" 
                    + ch.getSdtCH() + "','"                    
                    + ch.getDiaChiCH() + "') ";
            //System.out.println(query);
            //System.exit(0);
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean deleteCuaHang(CuaHangModel ch) {
        Connection conn = BaseModel.getConnection();
        try {
            String query = " DELETE FROM CuaHang  WHERE ma_cua_hang= '"+ch.getMaCH()+"' ";
            //System.out.println(query);
            //System.exit(0);
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean editCuaHang(CuaHangModel ch) {
        Connection conn = BaseModel.getConnection();
        try {
            String query = " UPDATE CuaHang SET ma_cua_hang='"+ch.getMaCH()+"' , ten_cua_hang='"+ch.getTenCH()+"' , so_dien_thoai='"+ch.getSdtCH()+"' , dia_chi='"+ch.getDiaChiCH()+"' ";
            //System.out.println(query);
            //System.exit(0);
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}