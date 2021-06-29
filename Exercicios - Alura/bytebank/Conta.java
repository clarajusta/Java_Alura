import javax.print.attribute.standard.NumberOfDocuments;

public class Conta {

    int agencia;
    int numero;
    String titular;
    double saldo;
    
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void transfere(double valor, Conta destino) {
        //if(this.saldo>=valor){
        //    this.saldo -= valor;
            this.saca(valor);
            destino.deposita(valor);
    }
}



