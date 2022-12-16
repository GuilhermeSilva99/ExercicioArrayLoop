import java.util.Scanner;

public class Questao4 {
    /**
     * Enunciado
     * Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        float media = 0f;

        int numero;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numero =scanner.nextInt();

            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
            media += numero;
        }
        media = media/5;

        System.out.println("Maior número: "+maior);
        System.out.println("Menor número: "+menor);
        System.out.println("Média dos números: "+media);
    }
}
