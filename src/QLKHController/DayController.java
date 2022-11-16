package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import App.*;
import java.util.ArrayList;
/**
 *
 * @author 
 */
public class DayController {
    public static ArrayList<DayModel> listDay() {
        return DayModel.getListDay();
    }
    
    public static boolean doAddDay(DayModel d){
        return (DayModel.addDay(d));
    }
    
    public static boolean doDeleteDay(DayModel d){
        return (DayModel.deleteDay(d));
    }
    
    public static boolean doEditDay(DayModel d){
        return (DayModel.deleteDay(d));
    }
}