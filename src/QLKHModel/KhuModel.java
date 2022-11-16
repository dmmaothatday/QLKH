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
public class KhuModel {
    private String MaKhu;
    private int SoLuongDay;

    public KhuModel() {
    }

    public KhuModel(String MaKhu, int SoLuongDay) {
        this.MaKhu = MaKhu;
        this.SoLuongDay = SoLuongDay;
    }

    public String getMaKhu() {
        return MaKhu;
    }

    public void setMaKhu(String MaKhu) {
        this.MaKhu = MaKhu;
    }

    public int getSoLuongDay() {
        return SoLuongDay;
    }

    public void setSoLuongDay(int SoLuongDay) {
        this.SoLuongDay = SoLuongDay;
    }
    
    public static ArrayList<KhuModel> getListKhu() {
        Connection conn = BaseModel.getConnection();
        ArrayList<KhuModel> listKhu = new ArrayList<>(); 
        try{
            String query = "select * from Khu";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                KhuModel k = new KhuModel();
                
                k.setMaKhu(rs.getString(1));
                k.setSoLuongDay(rs.getInt(2));
              
                listKhu.add(k); 
            }
            return listKhu; 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listKhu;  
    }
    
    public static boolean addKhu(KhuModel k) {
        Connection conn = BaseModel.getConnection();
        try {
            String query = "INSERT INTO Khu(ma_khu,so_luong_day) VALUES('" + k.getMaKhu() + "','" + k.getSoLuongDay() + "')";
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
    
    public static boolean deleteKhu(KhuModel k) {
        Connection conn = BaseModel.getConnection();
        try {
            String query = " DELETE FROM Khu WHERE ma_khu= '"+k.getMaKhu()+"' ";
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
    
    public static boolean editKhu(KhuModel k) {
        Connection conn = BaseModel.getConnection();
        try {
            String query = " UPDATE Khu SET ma_khu='"+k.getMaKhu()+"' , so_luong_day='"+k.getSoLuongDay()+"' ";
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
    
    public static boolean seekKhu(KhuModel k) {
        Connection conn = BaseModel.getConnection();
        try {
            String query = "  ";
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