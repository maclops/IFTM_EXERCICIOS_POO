package singleton;

public class TesteIncremental extends incremental {
		public static void main(String[] args) {
			for(int i = 0;i<10;i++) {
				inc.incremental();
				System.out.println(Incremento());
			}
		}
	}