public class Questao9 {
    /**
     * Enunciado
     * Supondo que a população do país "A" seja de 80_000 habitantes, com uma taxa anual de crescimento de 3%.
     * E que a população de B seja 200_000 habitantes, com uma taxa de crescimento de 1.5%.
     *
     * Faça um programa que calcule e escreva o número de anos necessários para que a população do
     * país A ultrapasse ou iguale a população do país B mantidas as taxas de crescimento.
     */
    public static void main(String[] args) {
        float populacaoA = 80_000f;
        float populacaoB = 200_000f;
        float taxaPaisA = 3f/100f;
        float taxaPaisB = 1.5f/100f;
        int anos = 0;

        boolean populacaoBmaiorPopulacaoA = true;

        while (populacaoBmaiorPopulacaoA){
            populacaoA = (populacaoA*taxaPaisA) + populacaoA;
            populacaoB = (populacaoB*taxaPaisB) + populacaoB;
            anos+=1;
            if(populacaoA >= populacaoB){
                populacaoBmaiorPopulacaoA = false;
            }
        }
        System.out.println("Quantidade de anos: "+anos);
    }
}
