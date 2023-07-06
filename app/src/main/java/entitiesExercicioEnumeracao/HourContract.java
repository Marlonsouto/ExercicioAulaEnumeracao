
package entitiesExercicioEnumeracao;

import java.util.Date;


public class HourContract {
 private   Date date;
 private  double valuePerHour;
 private  int hour;
 

    public HourContract(Date date, double valueperhour, int hour) {
        this.date = date;
        this.valuePerHour = valueperhour;
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public double totalValue (double valuePerhour, int Hour) {
        return  Hour * valuePerhour ;
    }
            
    
    
    
    
    
    
}
