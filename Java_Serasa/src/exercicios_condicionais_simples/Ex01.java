package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        double velocidadeCarro = Double.parseDouble(JOptionPane.showInputDialog(null, "Velocidade do Veiculo: "));

        if (velocidadeCarro > 80.0) {
            JOptionPane.showMessageDialog(null, "Você foi Multado!!!");

            double velocidadeExcesso = velocidadeCarro - 80;
            double valorMulta = 5.0 * velocidadeExcesso;

            JOptionPane.showMessageDialog(null, "Você passou a acima do limite " + velocidadeExcesso + "Km/h \n E deverar pagar R$ " + valorMulta);
        }
        else {
            JOptionPane.showMessageDialog(null, "Velocidade permitida!");
        }
    }
}