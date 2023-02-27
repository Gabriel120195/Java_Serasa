package aula04;

import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Localizacao {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Locale local = Locale.getDefault();

        double valor = 2670.52;

        if (local.getCountry().equals("BR")) {
            df.applyPattern("R$ #,##0.00");
        }
        JOptionPane.showMessageDialog(null, "Configurações do Sistem Operacional: "
                                                    + "\n Sigla: " + local.getCountry()
                                                    + "\n País: " + local.getDisplayCountry()
                                                    + "\n Idioma: " + local.getDisplayLanguage()
                                                    + "\n Valor: " + df.format(valor));
    }
}