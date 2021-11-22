
public class Car {
	//needs color and type
	String color;
	String type;
	
	//methods: start and description
	void start() {
		System.out.println("Get Started!");
	}
	
	void printDescription() {
		System.out.println("This is a" + color + " " + type);
	}
	
	//----------------------
	//another option:
	
	Car(String c, String t){
		color = c;
		type = t;
	}
	Car myCar = new Car("Silver", "DeLorean DMC-12");
}

