package SOLID_DIP;

public class CarroDeCorrida extends Veiculo {

	public CarroDeCorrida(int combustivel) {
		super(combustivel);
	}
	
	public void acelerar() {
		setPotencia(getPotencia()+1);
		setQuantidadeCombustivel(getQuantidadeCombustivel()-1);
	}
	
}
