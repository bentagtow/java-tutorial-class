package javaCourseExamples;


public class loops {

	public static void main(String[] args) {
		int x = 0;
		
		
		// while loop
		while_label:
		while (x <= 20) {
			if (x % 2 == 0) {
				System.out.println(x);
				break while_label;
			}
			x++;
		}

		
		// do while
		do {
			if (x % 2 == 0) {
				System.out.println(x);
			}
			x++;
		} while (x <= 20);
		
		
		//for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
	}
}
