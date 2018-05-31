package SOLID_ISP;

public abstract class Carro extends Veiculo implements Radio {

	private boolean radioOn;

	private boolean radioOn() {
		return radioOn;
	}

	@Override
	public void ligarRadio() {
		radioOn = true;
	}

	@Override
	public void desligarRadio() {
		radioOn = false;
	}

}
