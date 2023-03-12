import javax.swing.JOptionPane;

public class Vetor {
    public static void main(String[] args) {
        
        int idades[] = new int[10];

        // idades[0] = 58;
        // idades[1] = 20;

        for (int i = 0; i < idades.length; i++) {
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade:"));
        }

        System.out.println("-------- idades -------");

        try {
            for (int i = 0; i < idades.length; i++) {
                System.out.println("Idades = " + idades[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,"Você está tentando acessar um valor que não existe!");
        }
    }
}