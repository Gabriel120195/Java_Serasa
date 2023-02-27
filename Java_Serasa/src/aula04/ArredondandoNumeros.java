package aula04;

import javax.swing.JOptionPane;

public class ArredondandoNumeros {
    public static void main(String[] args) {

        //Exemplo 01
        double valorArrendodando = Math.ceil(8.8756);
        System.out.println("Arrendodamento ceil: " + valorArrendodando);

        float nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua note: "));
        JOptionPane.showMessageDialog(null, "Nota original: " + nota 
                                        + "\nArredondando para baixo: " + Math.floor(nota));
    }
}