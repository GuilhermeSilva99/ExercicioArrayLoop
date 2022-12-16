import java.util.Scanner;

public class Questao5 {
    /**
     * Enunciado
     * Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados.
     * Ao final, informe qual o nome mais longo presente na lista.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] convidados = new String[5];
        String nome = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do "+(i+1)+"º convidado: ");
            nome = scanner.nextLine();
            convidados[i] = nome;
        }

        int indiceNome=0;
        for (int i = 0; i <convidados.length; i++) {
            if(convidados[i].length() > convidados[indiceNome].length() ){
                indiceNome = i;
            }
        }
        System.out.println("O nome mais longo presente na lista é: "+convidados[indiceNome]);
    }
}
