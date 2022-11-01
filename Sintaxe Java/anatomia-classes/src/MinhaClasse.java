public class MinhaClasse {

    public static void main(String[] args) {
        System.out.println("Olá turma, sejam bem-vindos");

        // final String BR = "Brasil"; variaveis com final ou toda em MAIUSCULO não podem sofrer alterações, terão sempre um valor fixo. aula 1 e 2
 
        System.out.println("Aula 3");

        // String meuNome = "Sabrina"; declarando as variaveis
        // int anoFabricacao = 2022;
        // boolean verdadeira = true;

        // anoFabricacao = 2018; alterando o valor da variavel

        // implementando metodo

        String primeiroNome = "Sabrina";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
    
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    } // método feito na aula 3
}

