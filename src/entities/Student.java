package entities;

public class Student {
	private String name;
	private String email;
	
	public Student(String name,String email) {
		setName(name);
		setEmail(email);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return getName()+", "+getEmail();
	}

}
