import java.util.Scanner;

public class Questao7 {
    /**
     * Enunciado
     * Escreva um programa que lê nome e idade de 5 pessoas e ao final informa quem é o mais novo,
     * o mais velho e qual a média de idade.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maisVelho = "";
        int idadeMaisVelho = Integer.MIN_VALUE;
        String maisNovo = "";
        int idadeMaisNovo = Integer.MAX_VALUE;
        float mediaIdade = 0f;
        String nome = "";
        int idade = 0;
        String enter = "";

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            nome = scanner.nextLine();
            System.out.println("Digite a " + (i + 1) + "º idade: ");
            idade = scanner.nextInt();
            enter = scanner.nextLine();

            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                maisVelho = nome;
            }
            if (idade < idadeMaisNovo) {
                idadeMaisNovo = idade;
                maisNovo = nome;
            }
            mediaIdade += idade;
        }
        mediaIdade = mediaIdade / 5;
        System.out.println("O mais novo: " + maisNovo);
        System.out.println("O mais velho: " + maisVelho);
        System.out.println("A média de idade: " + mediaIdade);
    }
}
