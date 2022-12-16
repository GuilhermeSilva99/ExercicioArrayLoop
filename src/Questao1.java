import java.util.Arrays;
import java.util.Scanner;

public class Questao1 {
    /**
     * Enunciado
     * Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras.
     * Ao final da entrada dos 5 itens, exiba a lista completa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] frutas = new String[5];
        String nomeFruta = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da "+(i+1)+"ª fruta: ");
            nomeFruta = scanner.nextLine();
            frutas[i] = nomeFruta;
        }

        System.out.println("Frutas digitadas:");
        for (String item: frutas) {
            System.out.println(item);
        }
    }
}
