package classandobject;

public class ParentCustomer {
	private String name;
	private String address;   // Instance variable or class variables
	private String contact;
	private String email;
	public ParentCustomer(String name, String address, String contact, String email) {
		this.name=name;
		this.address=address;
		this.contact=contact;
		this.email=email;
		//System.out.println("Parent"+name);
		//System.out.println("Parent"+this.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
