package javaCourseExamples;
 

public class Person {
	private String firstName;
	private String lastName;
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public Person(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	public Person() {
		this("Jane", "Doe");
	}
}
