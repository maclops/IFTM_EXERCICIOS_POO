package ocp;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	public static void main(String[] args) {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		
		Funcionario roberto = new Gerente("Roberto", "Gerente", 6000);
		Funcionario robson = new Vendedor("Robson", "Vendedor", 4000, 200, 100);
		Funcionario keilane = new Assistente("Keilane", "Assistente", 2500);
		Funcionario gabriel = new Supervisor("Gabriel", "Supervisor", 7500);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(roberto);
		funcionarios.add(robson);
		funcionarios.add(keilane);
		funcionarios.add(gabriel);
		
		for (Funcionario funcionario : funcionarios) {
			
			System.out.printf("%s: %s - Salário: R$%.2f\n", funcionario.getCargo(), funcionario.getNome(),
								calculadora.calcula(funcionario));
		}
	}
}
