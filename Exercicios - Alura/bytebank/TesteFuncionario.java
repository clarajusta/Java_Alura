public class TesteFuncionario {
    
    public static void main(String[] args) {

        Funcionario clara = new Funcionario();
        clara.setNome("Clara Justa");
        clara.setCpf("222.222.222-2");
        clara.setSalario(2600.00);

        System.out.println(clara.getNome());
        System.out.println(clara.getBonificacao());
    }
}
