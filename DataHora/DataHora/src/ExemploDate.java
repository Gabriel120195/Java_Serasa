import java.text.DateFormat;
import java.util.Date;

public class ExemploDate {

     static final long MILIS_POR_DIA = 1000*60*60*24;
     public static void main(String[] args) {

         Date data = new Date();
         long tempo = data.getTime();

         System.out.println("Milis = " + tempo);
         System.out.println("Milis por dia = " + MILIS_POR_DIA);
         System.out.println("Data = " + data);
         
         System.out.println("==========================");

         Date data2 = new Date();

         StringBuilder sb = new StringBuilder();
         sb.append("Milis: ");
         sb.append(data.getTime());
         sb.append("\nDias: ");
         sb.append(tempo / MILIS_POR_DIA);
         sb.append("\nMeses: ");
         sb.append(tempo / MILIS_POR_DIA / 30);
         sb.append("\nAnos: ");
         sb.append(tempo / MILIS_POR_DIA / 365);
         sb.append("\nData2: ");
         sb.append(data2);

         System.out.println(sb.toString());
    }
}
