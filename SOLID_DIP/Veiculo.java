package SOLID_DIP;

public class Veiculo {

	private final int capacidadeTanqueCombustivel;
	private int quantidadeCombustivel;
	private int potencia;
	
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
	
	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int Potencia) {
		this.potencia = potencia;
	}
	
	public void acelerar() {
		quantidadeCombustivel--;
	}
	
}
