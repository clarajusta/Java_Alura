public class TestaMetodos2 {
    public static void main(String[] args){
        
        Cliente clara = new Cliente();
        clara.nome = "clara";
        
        Conta contaDaClara = new Conta();
        contaDaClara.titular = clara;
        System.out.println(contaDaClara.titular.nome);
    }
}
//contadaClara.titular = new Cliente();