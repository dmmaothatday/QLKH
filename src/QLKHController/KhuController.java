
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import App.*;
import java.util.ArrayList;
/**
 *
 * @author 
 */
public class KhuController {
    public static ArrayList<KhuModel> listKhu() {
        return KhuModel.getListKhu();
    }
    
    public static boolean doAddKhu(KhuModel k){
        return (KhuModel.addKhu(k));
    }
    public static boolean doDeleteKhu(KhuModel k){
        return (KhuModel.deleteKhu(k));
    }
     public static boolean doEditCuaHang(KhuModel k){
        return (KhuModel.editKhu(k));
    }
}