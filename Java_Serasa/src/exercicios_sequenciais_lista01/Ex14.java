package exercicios_sequenciais_lista01;

import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args) {
        final float PRECO_POR_DIA = 90f;
        final float PRECO_POR_KM = 0.20f;

        float kmRodados = Float.parseFloat(JOptionPane.showInputDialog(null, "Km percorridos: "));
        float dias = Float.parseFloat(JOptionPane.showInputDialog(null, "Dias Utilizados: "));

        float calDia = PRECO_POR_DIA * dias;
        float calKms = PRECO_POR_KM * kmRodados;

        JOptionPane.showMessageDialog(null,"Total á Pagar R$ " + (calDia + calKms));
    }
}