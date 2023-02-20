package aula02;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.JOptionPane;

// Usando JOptionPane, elabore uma classe que receba o nome de um produto e o seu valor. 
// O desconto deve ser calculado de acordo com o valor fornecido conforme abaixo. 
// Utilizando a estrutura if-else, apresente em tela o nome do produto, valor original do 
// produto e o novo valor depois de ser realizado o desconto. Caso o valor digitado seja 
// menor que zero, deve ser emitida uma mensagem de aviso.

public class Ex01ProdutoEValor {
    public static void main(String[] args) {
        float valTotal = 0.0f;
         

        String nome = JOptionPane.showInputDialog(null,"Nome do Produto");
        float valProduto = Float.parseFloat (JOptionPane.showInputDialog(null,"Valor do produto: "));

        if (0 > valProduto) {
            JOptionPane.showMessageDialog(null,"Valor Menor que Zero!!");
            System.exit(0);
        }
        if ((valProduto >=50) && (valProduto < 200)) {
            valTotal = (valProduto * 5) / 100;
        } 
        if ((valProduto >=200) && (valProduto < 500)) {
            valTotal = (valProduto * 6) / 100;
        }
        if ((valProduto >=500) && (valProduto < 1000)) {
            valTotal = (valProduto * 7) / 100;
        }

        if (valProduto >= 1000) {
            valTotal = (valProduto * 8) / 100;
        }
    
        JOptionPane.showMessageDialog(null,"Nome do Produto: " + nome + "\n" + "Valor do Produto: " + valProduto + "\n"  + "Valor com Desconto R$ " + (valProduto - valTotal));
    }
}