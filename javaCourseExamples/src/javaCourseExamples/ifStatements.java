package javaCourseExamples;

public class ifStatements {
	
	public static void main(String[] args) 
	{
		boolean inMinneapolis = false;
		boolean inSP = true;
		
		if(inMinneapolis) {
			System.out.println("Hello from MN");
		} else if (inSP) {
			System.out.println("Hey from SP");
		}
		
		//___________________________________

		
		int j = 3;
		String str;
		switch(j) 
		{
		case 1: 
		case 3: 
			str = "odd";
			break;
		case 2:
		case 4:
			str = "even";
			break;
		default: 
			str = "out of range";
			break;
		}
		System.out.println(str);
		
		//___________________________________
		
		DaysEnum today = DaysEnum.FRIDAY; 
		String response = "";
		
		switch(today) {
		case MONDAY:
			response = "work time";
			break;
		case FRIDAY: 
			response = "fun time";
		default:
			break;
		}
		System.out.println(response);
	}
	
}
