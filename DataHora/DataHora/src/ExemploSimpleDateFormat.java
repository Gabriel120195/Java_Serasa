import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploSimpleDateFormat {
    public static void main(String[] args) {

        Date data = new Date();

        String formato = "dd/MM/yyyy  hh:mm:ss";
        DateFormat df = new SimpleDateFormat(formato);


        StringBuilder sb = new StringBuilder();
        sb.append("Data Formatada: ");
        sb.append(df.format(data));

        System.out.println(sb.toString());



    }
}