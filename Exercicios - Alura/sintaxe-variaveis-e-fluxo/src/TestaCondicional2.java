public class TestaCondicional2 {
    public static void main(String[] args) {

        System.out.println("Testando Condicionais");

        int idade = 18;
        int quantidadePessoas = 2;
        boolean acompanhado = quantidadePessoas>1;

        if (idade>=18 && acompanhado){
            System.out.println("Maior de idade ou acompanhado");
        }

        else{
                System.out.println("Menor de idade desacompanhado");
        }

    }
}
