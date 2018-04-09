package ocp;

public class Gerente extends Funcionario{


	public Gerente(String nome, String cargo, double salarioBase) {
		super(nome, cargo, salarioBase);
	}

	@Override
	public double calculaSalario() {
		return 2 * getSalarioBase();
	}

}
