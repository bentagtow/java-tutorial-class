
public class Car {
	String color;
	String type;
	int serialNumber;
	static int carCount;
	{
		color = "Red";
		type = "Celica";
		carCount++;
		serialNumber = carCount;
	}
	
	Car(){
		carCount++;
		serialNumber = carCount;
	}
	
	String getDescription(){
		String desc = "This is a " + color + " " + type;
		return desc;
	}
	void customize(String color, String type){
		this.color = color;
		this.type = type + " " + this.type;
		printDesc();
		
	}
	
	void printDesc() {
		System.out.println(getDescription());
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.customize("blue", "convertiable");
//		myCar.printDesxsc();
		System.out.println(myCar.serialNumber);
	}
	
}
