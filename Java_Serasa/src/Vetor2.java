
public class Vetor2 {
    public static void main(String[] args) {
        
        String frutas[] = {"Banana", "Maçã", "Morango", "Uva", "Melancia"};


        //System.out.println(frutas[3]);

        //Formas de ler e filtar elementos do array

        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equals("Banana")) {
            System.out.println("Frutas = " + frutas[i]);
            }
        }

        for (String elemento : frutas) {
            if(elemento.equals("Banana"))
            System.out.println("Frutas == " + elemento);
        }
    }   
}