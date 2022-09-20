import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String tempString;
		int tempInt;
		Movie m = new Movie();
	
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
		
	
		System.out.println("**END OF PROGRAM**");
		

	}

}
