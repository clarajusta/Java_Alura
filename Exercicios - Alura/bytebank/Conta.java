public class Conta {

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;
    private static int total = 0;
    
    public Conta(int agencia, int numero) {
        total++;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100; //toda conta começa com saldo de 100
        System.out.println("Criando uma conta");
    }

    public static int getTotal() {
        return Conta.total;
    }

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

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}
}



