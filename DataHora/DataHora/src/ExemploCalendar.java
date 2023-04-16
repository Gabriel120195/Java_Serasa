import java.util.Calendar;
import java.util.Date;

public class ExemploCalendar {
    public static void main(String[] args) {
     
        Calendar cal = Calendar.getInstance();

        Date hoje = new Date();

        cal.setTime(hoje);
        
        //Ano
        System.out.println(cal.get(cal.YEAR));

        //Dia
        System.out.println(cal.get(cal.DAY_OF_MONTH));

        //Mes // Adicionar +1 pois conta apartir do 0
        System.out.println(cal.get(cal.MONTH) + 1);
        

        //Somente um exemplo / Pega a hora do dia 
        int hora = cal.get(cal.HOUR_OF_DAY);
        String msg = " ";

        if (hora > 0 && hora < 12) {
            msg = "Bom Dia!!";

        } else if (hora > 12 && hora < 19) {
            msg = "Boa Tarde!!";
            
        } else {
            msg = "Boa Noite!!";
        }

        System.out.println(msg);
    }
}