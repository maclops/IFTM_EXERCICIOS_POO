package ocp;

public abstract class Funcionario {
	private String nome, cargo;
	private double salarioBase;	

	public Funcionario(String nome, String cargo, double salarioBase) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public String getCargo() {
		return cargo;
	}

	public String getNome() {
		return nome;
	}

	public abstract double calculaSalario();
}
