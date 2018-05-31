package SOLID_ISP;

public abstract class Veiculo implements Motor {

	private boolean motorLigado;

	private boolean isMotorFuncionando() {
		return motorLigado;
	}

	@Override
	public void ligarMotor() {
		motorLigado = true;
	}

	@Override
	public void desligarMotor() {
		motorLigado = false;
	}

}
