public class CriaConta {
   public static void main(String[] args) {
       Conta primeiraConta = new Conta(1234, 123456);
       primeiraConta.deposita(200);
       System.out.println(primeiraConta.getSaldo());

       primeiraConta.deposita(100);
       System.out.println(primeiraConta.getSaldo());

       Conta segundaConta = primeiraConta;
       segundaConta.deposita(50);

       System.out.println("O saldo da primeira conta é de: " + primeiraConta.getSaldo());
       System.out.println("O saldo da segunda conta é de: " + segundaConta.getSaldo());

       System.out.println(Conta.getTotal());
   } 
}
