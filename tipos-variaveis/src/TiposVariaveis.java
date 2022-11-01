public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;



// como definir que um valor nunca podera mudar
        int numero = 5;
        numero = 10;
        System.out.println(numero);

//sem o final se definir o valor de PI e tentar mudar ele vai permitir, por a variavel em UPPERCASE não a torna final.
        final double VALOR_DE_PI = 3.14;
       // VALOR_DE_PI = 10.75; vai dar erro pois o valor nao pode ser alterado

    }
}
