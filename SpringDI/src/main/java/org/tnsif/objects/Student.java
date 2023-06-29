package org.tnsif.objects;

public class Student {
	//DI in form of objects
	Address address;

	//achieving DI using constructor
	public Student(Address address) {
		super();
		this.address = address;
	}
	
	public void print() {
		address.display();
	}
	
}
