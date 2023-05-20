
import java.text.DateFormat;
import java.util.Date;

public class ExemploDateFormat {
    public static void main(String[] args) {

        Date data = new Date();
        
        DateFormat exLong = DateFormat.getDateInstance(DateFormat.LONG);

        DateFormat exMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
        
        DateFormat exShort = DateFormat.getDateInstance(DateFormat.SHORT);

        DateFormat exFull = DateFormat.getDateInstance(DateFormat.FULL);
        //para outro formato trocar o Medium para short
        
        //StringBuilder concatena as strings
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Data formatada: ");

        //Tipo short
        sb2.append(exShort.format(data));

        //Tipo Medium
        sb2.append(exMedium.format(data));

        //Tipo long
        sb2.append(exLong.format(data));

        sb2.append(exFull.format(data));


        System.out.println(sb2.toString());

        System.out.println(exFull.format(data));
    }
}