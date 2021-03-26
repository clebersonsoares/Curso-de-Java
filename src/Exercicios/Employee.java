package Exercicios;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return this.grossSalary - this.tax;
	}

	public void increaseSalary(double percentage) {
		this.grossSalary = this.grossSalary + (this.grossSalary * 10 / 100);
	}

	public String toString() {
		return "Employee: " + this.name + ", $" + String.format("%.2f",this.netSalary());
	}
}
