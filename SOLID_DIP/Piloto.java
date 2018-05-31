package SOLID_DIP;

public class Piloto {

	private Veiculo veiculo;
	
	public Piloto() {
		this.veiculo = new CarroDeCorrida(100);
	}
	
	public void aumentarVelocidade() {
		veiculo.acelerar();
	}
	
}
