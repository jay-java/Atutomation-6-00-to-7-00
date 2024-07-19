package core;

import java.time.LocalDateTime;

class Person{
	private int id;
	private String name;
	private long contact;
	private String address;
	private LocalDateTime dateTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int id, String name, long contact, String address, LocalDateTime dateTime) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + ", dateTime="
				+ dateTime + "]";
	}
	
	
}
public class P014_Encapsulation {
	public static void main(String[] args) {
		Person p1 = new Person(1,"java",987654231,"AMD",LocalDateTime.now());
		System.out.println(p1);
		
		Person p2 = new Person();
		p2.setId(2);
		p2.setName("python");
		p2.setContact(987654);
		p2.setAddress("mumbai");
		p2.setDateTime(LocalDateTime.now());
		System.out.println(p2);
	}
}
