package Exercicios;

public class Student {
	public String name;
	public double grade;
	public boolean situation;
	
	public void addGrade(double grade) {
		this.grade += grade;
		
	}
	public void checkSituation() {
		if(this.grade < 60) {
			this.situation = false;
		}else {
			this.situation = true;
		}
	}
	public String toString() {
		return (this.situation == true ?"FINAL GRADE: "+String.format("%.2f%n",this.grade)+"PASS":"FINAL GRADE: "+this.grade+"\nFAILED\nMISSING "+(60-this.grade)+" POINTS");
	}
	
}
