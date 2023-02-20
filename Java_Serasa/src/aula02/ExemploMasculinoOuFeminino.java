package aula02;

import javax.swing.JOptionPane;

public class ExemploMasculinoOuFeminino {
    public static void main(String[] args) {
        Object[] opcoes = {"Masculino", "Feminino"};
        String resposta = (String) JOptionPane.showInputDialog(null, "Selecione Sexo:\n ", 
        "Pesquisa",JOptionPane.PLAIN_MESSAGE,null,opcoes,"Masculino");

        if (resposta == null) {
            JOptionPane.showMessageDialog(null, "Você pressionou cancel");
        }

        if (resposta == "Masculino") {
            JOptionPane.showMessageDialog(null, "Você Selecionou Masculino");
        }

        if (resposta == "Feminino") {
            JOptionPane.showMessageDialog(null, "Você Selecionou Feminino");
        }

        System.exit(0);
    }
}