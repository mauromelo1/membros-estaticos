package application;

import entities.CalculadoraDeSalario;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Funcionario x = new Funcionario("Maria", 100.0, 15.0);
		Funcionario y = new Funcionario("Joao", 80.0, 10.0);
		
		double resultado = CalculadoraDeSalario.valorPago(100.0, 7.0);
		
		System.out.println(resultado);

	}

}
