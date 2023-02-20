package exercicios_sequenciais_lista01;

import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
        final float VALOR_HORA = 25.0f;

        int dias = Integer.parseInt (JOptionPane.showInputDialog(null, "Dias Trabalhados no mês: "));

        float calSalario = (8 * VALOR_HORA) * dias;

        JOptionPane.showMessageDialog(null,"Salário do funcionário R$ " + calSalario);
    }
}