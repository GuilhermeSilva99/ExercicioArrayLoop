import java.sql.SQLOutput;
import java.util.Scanner;

public class Questao2 {
    /**
     * Enunciado
     * Escreva um programa que lê uma palavra e a escreve de volta ao contrário.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma palavra: ");
        String palavra = scanner.nextLine();
        char[] palavraInversa = palavra.toCharArray();
        for (int i = (palavraInversa.length-1); i >= 0; i--) {
            System.out.print(palavraInversa[i]);
        }
    }
}
