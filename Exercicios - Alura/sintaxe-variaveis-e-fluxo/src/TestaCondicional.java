public class TestaCondicional {
    public static void main(String[] args) {

        System.out.println("Testando Condicionais");

        int idade = 17;
        int quantidadePessoas = 2;

        if (idade>=18){
            System.out.println("Maior de idade");
        }

        else{
            if (quantidadePessoas>1) {
                System.out.println("Menor de idade, porém acompanhado");
            }
            else
                System.out.println("Menor de idade");
        }

    }
}
