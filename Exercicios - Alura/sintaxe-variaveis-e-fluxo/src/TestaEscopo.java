public class TestaEscopo {
    public static void main(String[] args) {

        System.out.println("Testando Condicionais");

        int idade = 18;
        int quantidadePessoas = 3;
        boolean acompanhado;

        if (quantidadePessoas >=2){
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        if (idade >= 18 || acompanhado) {

            System.out.println("Maior de idade ou acompanhado");
        } else {
            System.out.println("Menor de idade e desacompanhado");
        }
    }
}