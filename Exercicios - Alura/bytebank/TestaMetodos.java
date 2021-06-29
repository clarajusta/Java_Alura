public class TestaMetodos {
    
    public static void main(String[] args) {
        Conta contaDaClara = new Conta();
        Conta contaDaPaula = new Conta();

        contaDaPaula.saldo += 500;
        //System.out.println(contaDaPaula.saldo);
        contaDaClara.saldo += 500;
        //System.out.println(contaDaClara.saldo);

        contaDaPaula.saca(10);
        System.out.println(contaDaPaula.saldo);

        contaDaClara.deposita(50);
        System.out.println(contaDaClara.saldo);

        contaDaClara.transfere(100, contaDaPaula);
        System.out.println(contaDaPaula.saldo);
        System.out.println(contaDaClara.saldo);
    }
}
