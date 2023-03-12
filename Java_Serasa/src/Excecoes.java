import javax.swing.JOptionPane;

public class Excecoes {
    public static void main(String[] args) {
        
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Primeiro valor: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo valor: "));
        double resultado = 0.00;
        
        try {

            resultado = valor1 / valor2;

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Erro: " + e.getMessage());
        }
        
        System.out.println("Resultado = " + resultado);
    }
}