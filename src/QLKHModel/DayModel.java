package QLKHModel;
import QLKHController.*;
import QLKHView.*;
import App.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author trinh
 */
public class DayModel {
    private String MaDay;
    private int SucChua;
    private String MaKhu;
    ArrayList<SanPhamModel> DanhSachSP = new ArrayList<>();

    public DayModel(String MaDay, int SucChua, String MaKhu) {
        this.MaDay = MaDay;
        this.SucChua = SucChua;
        this.MaKhu = MaKhu;
        DanhSachSP = new ArrayList<>();
    }

    public DayModel() {
        DanhSachSP = new ArrayList<>();
    }

    public String getMaDay() {
        return MaDay;
    }

    public void setMaDay(String MaDay) {
        this.MaDay = MaDay;
    }

    public int getSucChua() {
        return SucChua;
    }

    public void setSucChua(int SucChua) {
        this.SucChua = SucChua;
    }

    public String getMaKhu() {
        return MaKhu;
    }

    public void setMaKhu(String MaKhu) {
        this.MaKhu = MaKhu;
    }
    
    public static ArrayList<DayModel> getListDay() {
        Connection conn = BaseModel.getConnection();
        ArrayList<DayModel> listDay = new ArrayList<>(); 
        try{
            String query = "select * from DaySP"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                DayModel d = new DayModel();
                
                d.setMaDay(rs.getString(1));
                d.setSucChua(rs.getInt(2));
                d.setMaKhu(rs.getString(3));
                
                listDay.add(d); 
            }
            return listDay;  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listDay;  
    }
    
    public static boolean addDay(DayModel d) {
        Connection conn = BaseModel.getConnection();
        try {
            String query = "  INSERT INTO DaySP(ma_day, suc_chua, ma_khu) VALUES('"+ d.getMaDay() + "' , '" + d.getSucChua() + "' , '"+d.getMaKhu()+"')  ";
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
    
    public static boolean deleteDay(DayModel d) {
        Connection conn = BaseModel.getConnection();
        try {
            String query = " DELETE FROM DaySP  WHERE ma_day='"+d.getMaDay()+"' ";
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
    
    public static boolean editDay(DayModel d) {
        Connection conn = BaseModel.getConnection();
        try {
            String query = " UPDATE Day SET ma_day='"+ d.getMaDay()+"' , suc_chua='"+d.getSucChua()+"' , ma_khu='"+d.getMaKhu()+"'  ";
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