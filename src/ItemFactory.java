import java.util.ArrayList;
import java.util.Scanner;

public class ItemFactory {
	
	public LibraryItem createItem(String itemType){
		
		//boolean which will help us to make tests to know whether the user enters the right type of data
		boolean testType = true;
		
		
		if (itemType.equalsIgnoreCase("BOOK") || itemType.equalsIgnoreCase("DVD") || itemType.equalsIgnoreCase("CD")){
			
			ArrayList<String> listOfAttributes = new ArrayList<String>();
			
			//We first ask the attributes in common for all the items
			
			//title
			while (testType){
				Scanner sc = new Scanner(System.in);
				System.out.println("Title of the item: ");

				
				//check that the user enters a title
				if (sc.nextLine() == ""){
					System.out.println("You did not enter a title");

				}
				else {
					listOfAttributes.add(0,sc.nextLine());
					testType = false;
				}
			}

			//publisher
			testType = true;
			while (testType){
				Scanner sc = new Scanner(System.in);
				System.out.println("publisher: ");

				//check that the user enters an publisher
				if (sc.nextLine() == ""){
					System.out.println("You did not enter a publisher");
				}
				else {
					listOfAttributes.add(1,sc.nextLine());
					testType = false;
				}
			}
			
			//publishingyear
			testType = true;
			while (testType){
				Scanner sc = new Scanner(System.in);
				System.out.println("Publishing year: ");
				
				//check that the user enters an int
				try{
					int year = sc.nextInt();
					listOfAttributes.add(2,Integer.toString(year));
					testType = false;
				}
				catch (java.util.InputMismatchException ime){
					System.out.println("You did not enter a year");
				}
			}
			
			//volumenumber
			testType = true;
			while (testType){
				Scanner sc = new Scanner(System.in);
				System.out.println("Volume number (press enter if there is only one volume): ");
				
				//check that the user enters an int
				try{
					int volnum = sc.nextInt();
					listOfAttributes.add(3,Integer.toString(volnum));
					testType = false;
				}
				catch (java.util.InputMismatchException ime){
					System.out.println("You did not enter a number");
				}
			}
			
			//consultationType
			testType = true;
			while (testType){
				Scanner sc = new Scanner(System.in);
				System.out.println("Consultation type (online consultation / borrowing): ");
				
				//check that the user enters a consultation type
				if(sc.nextLine().equalsIgnoreCase("online consultation") || sc.nextLine().equalsIgnoreCase("borrowing")){
					testType = false;
					if (sc.nextLine().equalsIgnoreCase("online consultation")){
						listOfAttributes.add(4,"onlineConsultation");
					}
					else {
						listOfAttributes.add(4,"borrowing");
					}
				}
				
				else {
					System.out.println("You have to enter either 'online consultation' or 'borrowing' ");
				}
			}
			
			
			//borrowingdeadline

			//loop for day
			testType = true;
			while (testType){
				Scanner sc = new Scanner(System.in);
				System.out.println("Publishing year: \n Day:");
				
				try{
					int day = sc.nextInt();
					testType = false;
				}
				catch (java.util.InputMismatchException ime){
					System.out.println("You did not enter a number");
				}
			}
			//loop for month
			boolean testType1 = true;
			while (testType1){
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Month:");
					
				try{
					int month = sc1.nextInt();
					testType1 = false;
					}

				catch (java.util.InputMismatchException ime){
					System.out.println("You did not enter a number");
				}
					
			}
				
			//loop for year
			boolean testType2 = true;
			while (testType2){
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Year:");
				
				try{
					int year = sc2.nextInt();
					testType2 = false;
				}
				catch (java.util.InputMismatchException ime){
					System.out.println("You did not enter a number");
				}
			}
			listOfAttributes.add(5,"day"+":"+"month"+":"+"year");
			
			
			



			
			
			
		}
		
		
		//If the user did not enter: book, cd or dvd
		else {
			System.out.println("You did not enter a valid item type");
			return null;
		}
	}
}