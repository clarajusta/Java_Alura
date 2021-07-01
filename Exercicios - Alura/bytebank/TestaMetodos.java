public class TestaMetodos {
    
    public static void main(String[] args) {
        Conta contaDaClara = new Conta();
        Conta contaDaPaula = new Conta();

        contaDaPaula.deposita(500);
        //System.out.println(contaDaPaula.saldo);
        contaDaClara.deposita(500);
        //System.out.println(contaDaClara.saldo);

        contaDaPaula.saca(10);
        System.out.println(contaDaPaula.getSaldo());

        contaDaClara.deposita(50);
        System.out.println(contaDaClara.getSaldo());

        contaDaClara.transfere(100, contaDaPaula);
        System.out.println(contaDaPaula.getSaldo());
        System.out.println(contaDaClara.getSaldo());
    }
}
