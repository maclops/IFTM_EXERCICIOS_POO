package ocp;

public class Vendedor extends Funcionario {
	private double totalVendas, meta;
	

	public Vendedor(String nome, String cargo, double salarioBase, double totalVendas, double meta) {
		super(nome, cargo, salarioBase);		
		this.totalVendas = totalVendas;
		this.meta = meta;
	}

	public double getTotalVendas() {
		return totalVendas;
	}
	
	public double getMeta() {
		return meta;
	}

	@Override
	public double calculaSalario() {
		if (totalVendas > meta)
			return getSalarioBase() + (totalVendas * 0.03) + 50;
		else
			return getSalarioBase() + (totalVendas * 0.03);
	}
}
