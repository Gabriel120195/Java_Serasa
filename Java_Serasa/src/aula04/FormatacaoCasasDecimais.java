package aula04;

import java.text.DecimalFormat;

public class FormatacaoCasasDecimais {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();

        Float pagamento = 25574f;

        System.out.println("Valor bruto = " + pagamento);

        df.applyPattern("R$ #,##0.00");
        System.out.println("Pagamento: " + df.format(pagamento));

        String formatado = df.format(pagamento);
        System.out.println("Pagamento Formatado: " + formatado);
    }
}