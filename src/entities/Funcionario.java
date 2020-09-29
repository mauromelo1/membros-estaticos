package entities;

public class Funcionario {

	private String nome;
	private Double valorPorHora;
	private Double horasTrabalhadas;

	public Funcionario(String nome, Double valorPorHora, Double horasTrabalhadas) {
		this.nome = nome;
		this.valorPorHora = valorPorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double valorPago() {
		return valorPorHora * horasTrabalhadas;
	}

}
