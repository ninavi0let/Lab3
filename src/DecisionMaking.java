import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int integer;
		boolean isEven = false;
		String cont = "y";
		String userName = "";
		
		System.out.println("What is your name?");
		userName = scan.nextLine();
		
		while (cont.equalsIgnoreCase("y")) {
			
		System.out.println(userName + ", enter an integer between 1 and 100: ");
		integer = scan.nextInt();
	
		System.out.println(integer);
		
		if ((integer % 2) == 0) {
			isEven = true;
		}
		
		if (integer >= 1 && integer <= 100) {
			
		if (!isEven) {
			System.out.println(userName + ", the number " + integer + " is odd.");
		} else if (isEven && integer >= 2 && integer <= 25) {
			System.out.println(userName + " , the number " + integer + " is even and less than 25.");
		} else if (isEven && integer >= 26 && integer <= 60) {
			System.out.println(userName + ", the number " + integer + " is even.");
		} else if (isEven && integer > 60) {
			System.out.println(userName + ", the number " + integer + " is even.");
		} else if (!isEven && integer > 60) {
			System.out.println(userName + ", the number " + integer + " is odd and over 60.");
		} else {
			System.out.println("Sorry " + userName + ", I cannot help you with this number.");
		}		
		} else {
			System.out.println("This number is out of range.");
		}
		
		System.out.println("Continue? (y/n):");
		cont = scan.next();
		
		}
		
		System.out.println("Goodbye!");
		
		scan.close();

	}

}
