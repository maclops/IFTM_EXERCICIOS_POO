package ocp;

public class Supervisor extends Funcionario{	

	public Supervisor(String nome, String cargo, double salarioBase) {
		super(nome, cargo, salarioBase);
	}

	@Override
	public double calculaSalario() {
		return getSalarioBase() * 1.5;
	}

}
