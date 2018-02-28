package fev27;

public class Conta {
	private String titular;
	private static int numero;
	private double saldo;
	private double limite;
	private static int totalDeContas;
	
	/*
	 * 4 - Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional?
	 * R: Pois sempre que a classe for instanciada e caso não tenha um contrutor sem argumentos, 
	 * será obrigatorio a passagem do nome.
	 */
	
	Conta(){
		Conta.numero ++;
	}
	
	Conta(String titular) {
		Conta.numero ++;
        this.titular = titular;
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
	
	boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            // não da pra sacar!
            return false;
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
	
	public static int getNumero() {
		return Conta.numero;
	}
	
}