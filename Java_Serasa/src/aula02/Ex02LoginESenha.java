package aula02;

import javax.swing.JOptionPane;

// Faça uma classe que solicite login e senha, simulando o acesso a um sistema. 
// Considere que os conteúdos de login e senha originais são iguais a “java8”. O usuário 
// deverá fornecer login e senha e você irá compará-los com os conteúdos originais. O usuário 
// tem três chances para digitar corretamente os dados de login e senha. Para cada tentativa 
// incorreta deve aparecer uma mensagem alertando o erro e apresentando a quantidade de 
// tentativas que ainda restam. Veja um exemplo de execução abaixo, em que o usuário já 
// digitou o login e senha incorretos por duas vezes, restando apenas uma última chance.

public class Ex02LoginESenha {
    public static void main(String[] args) {
        final String LOGIN = "java8";
        final String SENHA = "java8";

        for (int i = 0; i < 3;) {

        String entradaLogin = JOptionPane.showInputDialog(null,"Login: ");
        String entradaSenha = JOptionPane.showInputDialog(null,"Senha: ");

            if (LOGIN.equals(entradaLogin) && (SENHA.equals(entradaSenha))) {
                JOptionPane.showMessageDialog(null, "Login e Senha Aceitos!");
                i = 3;
            }
            else {
                i = i+1;
                JOptionPane.showMessageDialog(null, "Falha! verifique Login ou Senha!! \n Você tem mais " + (3 - i) + " Tentativa(s)!!");
            }
        }
    }
}