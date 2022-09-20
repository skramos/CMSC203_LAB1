import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String quit, tempString;
		int tempInt;
		Movie m = new Movie();
		
		do {
			System.out.print("Enter a movie Title: ");
			tempString = scan.nextLine();
			m.setTitle(tempString);
			
			System.out.print("Enter "+m.getTitle()+"'s rating: ");
			tempString = scan.nextLine();
			m.setRating(tempString);
			
			System.out.print("Enter the amount of tickets sold for "+m.getTitle()+": ");
			tempInt = scan.nextInt();
			m.setSoldTickets(tempInt);
			
			System.out.println("\n"+m+"\n");
			scan.nextLine();
			
			System.out.print("Do you want to continue? (Enter 'y' to continue or 'n' to quit): ");
			quit = scan.nextLine();
			
		}while(quit.equalsIgnoreCase("y")||!quit.equalsIgnoreCase("n"));
		
		System.out.println("**END OF PROGRAM**");
		

	}

}
