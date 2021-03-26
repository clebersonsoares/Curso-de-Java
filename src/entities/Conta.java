package entities;

public class Conta {

	private String numConta;
	private String name;
	private double saldo;

	public Conta(String conta, String nome) {
		this.numConta = conta;
		this.name = nome;
		this.saldo = 0.0;
	}

	public Conta(String conta, String nome, double depositoInicial) {
		this.numConta = conta;
		this.name = nome;
		deposito(depositoInicial);
	}

	public String getNumConta() {
		return numConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public double deposito(double value) {
		this.saldo += value;
		return this.saldo;
	}

	public double saque(double value) {
		this.saldo -= value + 5;
		return this.saldo;
	}

	public String toString() {
		return "Account " + getNumConta() + " Holder: " + getName() + ", Balance: $ "
				+ String.format("%.2f", getSaldo());
	}

}
