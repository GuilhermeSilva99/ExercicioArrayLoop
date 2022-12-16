import java.util.Scanner;

public class Questao3 {
    /**
     * Enunciado
     * Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int numero;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numero = scanner.nextInt();

            numeros[i] = numero;
        }

        System.out.println("Números impares");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.printf(numeros[i]+" | ");
            }
        }
        System.out.println();

        System.out.println("Números pares");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf(numeros[i]+" | ");
            }
        }
    }
}
