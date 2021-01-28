package entities;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;

	public double netSalary() {
		return grossSalary - tax;
	}

	public double increaseSalary() {
		grossSalary = this.grossSalary * (1 + (percentage / 100));
		return netSalary();

	}

}
