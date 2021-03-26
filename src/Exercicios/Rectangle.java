package Exercicios;

public class Rectangle {
	public double width;
	public double height;

	public double area() {
		return this.width * this.height;
	}

	public double perimeter() {
		return (this.width * 2 + this.height * 2);
	}

	public double diagonal() {
		return Math.sqrt((Math.pow(this.width, 2) + Math.pow(this.height, 2)));
	}

	public String toString() {
		return "AREA = " + String.format("%.2f%n", this.area()) + "PERIMETER = "
				+ String.format("%.2f%n", this.perimeter()) + "DIAGONAL = " + String.format("%.2f%n", this.diagonal());
	}
}
