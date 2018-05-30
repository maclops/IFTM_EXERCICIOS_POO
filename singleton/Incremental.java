package singleton;

class incremental {
	private static int count = 0;
	private int numero;
	static incremental inc = new incremental();

	public void incremental() {
		numero = ++count;
	}
	
	public String toString() {
		return " Incremental: " + numero;
	}

	public static Object Incremento() {
		return inc;
	}
	
}