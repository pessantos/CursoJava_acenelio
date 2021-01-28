package entities;

public class ContaBancaria {
	
	private int numeroConta;
	private String name;
	private double saldo;
	
	

	public ContaBancaria(int numeroConta, String name) {
		this.numeroConta = numeroConta;
		this.name = name;
	}

	public ContaBancaria(int numeroConta, String name, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.name = name;
		depositar(depositoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
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
	
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public void sacar(double quantia) {
		saldo -= quantia + 5;
	}

	@Override
	public String toString() {
		return "ContaBancaria " 
				+ numeroConta + 
				", name: " 
				+ name 
				+ ", saldo = R$ " 
				+ String.format("%.2f%n", saldo);
	}
	
	
	
	
	
	

}
