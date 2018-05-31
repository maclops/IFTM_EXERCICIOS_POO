package SOLID_SRP;

public class Veiculo {

	private final int capacidadeTanqueCombustivel;
	private int quantidadeCombustivel;
	
	public Veiculo (int totalTanque) {
		this.capacidadeTanqueCombustivel = totalTanque;
		this.quantidadeCombustivel = totalTanque;
	}
	
	public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	
	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}
	
	public void acelerar() {
		quantidadeCombustivel--;
	}
	
}
