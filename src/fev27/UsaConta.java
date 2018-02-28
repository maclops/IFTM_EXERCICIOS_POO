package fev27;

public class UsaConta {

	public static void main(String[] args) {
		
	/*	
	 * 	1 - Tente criar uma Conta no main e modificar ou ler um de seus atributos privados. O que acontece?
	 * 	R: O código não compila ao tentar ler ou modificar um atributo marcado como 'private'.
	 *	Mostra a mensagem "not visible"
	 */
		
		Conta conta = new Conta();
		
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta("MacLops");
		
		conta.deposita(1000);
		System.out.println(conta.getSaldo());
		conta.saca(250);
		System.out.println(conta.getSaldo());
		
		System.out.println(conta2.getNumero());
		
		Conta c = new Conta();
		c.setTitular("Batman");
	    System.out.println(c.getTitular());
	    
	}

}