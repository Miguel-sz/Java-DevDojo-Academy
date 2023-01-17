package academy.devdojo.maratonajava.introducao;
/*
    Crie variaveis para os campos descritos abaixo entre <> e
    imprima a seguinte mensagem.

    Eu <nome>, morando no endereço <endereço>,
    Confirmo que recebi o salario de <salario>, na data <data>.
 */

public class Aula003TiposPrimitivosExercicio5 {
    public static void main(String[] args) {
        String nome = "Miguel";
        String endereço = "Rua Paulo Faccini";
        double salarioDouble = 2500.56;
        String dataRecebimento  = "16/01/2023";
        String relatorio = "Eu "+nome+", morando no endereço "+endereço+
                " confirmo que recebi o salario de "+salarioDouble+
                " na data "+dataRecebimento;
        System.out.println(relatorio);
    }
}
