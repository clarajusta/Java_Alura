public class TestaMetodos2 {
    public static void main(String[] args){
        
        Cliente clara = new Cliente();
        //clara.nome = "clara";
        clara.setNome("clara");
        clara.setCpf("222.222.222.-22");
		clara.setProfissao("analista de engenharia de dados");
        
        Conta contaDaClara = new Conta(1234, 123456);
        contaDaClara.setTitular(clara);
        System.out.println(contaDaClara.getTitular().getNome());
		System.out.println(contaDaClara.getTitular());
        
        System.out.println(Conta.getTotal());
    }
}
//Conta contaDaClera = new Conta();
//contadaClara.titular = new Cliente();
//mais direto: contadaClara.titular.nome = "Clara";
//setTitular(Cliente titular) 