package ocp;

public class CalculadoraDeSalario {
	private double incentivo;

	public CalculadoraDeSalario(double incentivo) {
		super();
		this.incentivo = incentivo;
	}	
	
	public CalculadoraDeSalario() {
		super();
	}

	public double calcula(Funcionario func) {
		return func.calculaSalario() + incentivo;
	}
}
