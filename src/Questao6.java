import java.util.Scanner;

public class Questao6 {
    /**
     * Enunciado
     * Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        char[] vetor = palavra.toCharArray();
        for (int i = 0; i < vetor.length; i++) {
            if ((i+1) % 2 != 0) {
                System.out.print((vetor[i] + "").toUpperCase());
            } else {
                System.out.print((vetor[i] + "").toLowerCase());
            }
        }
        System.out.println();

    }
}
