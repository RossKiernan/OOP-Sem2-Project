package Project;
public class Person {
	
	private Name name;
	private String phone;
	private String email;
	
	public Person(Name name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public Name getName() {
		return name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return name + "" + phone + "" + email;
	}
	
	public void print() {
		System.out.println(toString());
	}
}
