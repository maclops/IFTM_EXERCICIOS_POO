package ocp;

public class Assistente extends Funcionario{	

	public Assistente(String nome, String cargo, double salarioBase) {
		super(nome, cargo, salarioBase);
	}

	@Override
	public double calculaSalario() {
		return getSalarioBase();
	}

}
