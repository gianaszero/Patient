class Patient {

	private String firstname;
	private String lastname;
	private int age;
	private String address;

	// Constructor
	public Patient (String fname, String lname, int age, String address) {
		this.firstname = fname;
		this.lastname  = lname;
		this.age 	   = age;
		this.address   = address;
	}
	public String getFullname () {
		return this.firstname + " " + this.lastname;
	}
	public int getAge () {
		return this.age;
	}
	public String getAddress () {
		return this.address;
	}

	public void displayInfo() {
		System.out.println("Fullname: " + getFullname());
		System.out.println("Age: "  	+ getAge());
		System.out.println("Address: "  + getAddress());
	}
}