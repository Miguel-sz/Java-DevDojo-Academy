package academy.devdojo.maratonajava.introducao;

public class Aula002TiposPrimitivos4 {
    public static void main(String [] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 1000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        double salarioFloat = (float) 2500.00;
        byte idadeByte = 127;
        short idadeShort = 3200;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Ellie";
        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é "+nome);

    }
}
