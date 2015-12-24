package lms;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.io.*;
import java.lang.reflect.Array;

public class Launcher {
	
	
	
	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub	
		
		boolean correctAnswer = false;

		LibraryFactory libF = new LibraryFactory();
		System.out.println("Welcome to the Library Management System (LMS), you will have to enter the corresponding number and then press Enter");
		System.out.println("Type (1) if you want to use the already saved library or (2) if you want to create a new one");
		while(!correctAnswer){
			try {
				Scanner sc = new Scanner(System.in);
				int libraryChoice = sc.nextInt();
				
				while (!(libraryChoice==1||libraryChoice==2)){
					System.out.println("That is not a possible choice, please try again");
					libraryChoice = sc.nextInt();
				}
				if (libraryChoice==1){
					System.out.println("Please enter the name of the library you would like to fetch. \n This file must be located in the savedLibraries directory, in the same directory as this LMS.");
					Scanner sc2 = new Scanner(System.in);
					String libraryName = sc2.nextLine();
					Serialization ser = new Serialization();
					try{
						Library library=ser.fetchLibrary(libraryName);
						correctAnswer = true;
					}
					catch(IOException e){
						System.out.println("Sorry, no library of the name "+libraryName+" exists, you must have spelled it wrong. \n Please write again either 1 or 2.");
					}
				}
				else if (libraryChoice==2){
					System.out.println("You decided to create a new library, respect the following syntax:\ncreate_library(libraryName,NBI,N,M,MP)\nNBI:a registered member can borrow at most NBI items at the same time\nN and M :a member who has borrowed at least N items over the last M months should be automatically granted the frequent member card\nMP:a frequent member who has borrowed less N items over the last MP months will lose frequent membership ");
					Scanner sc2 = new Scanner(System.in);
					String libraryCreation = sc2.nextLine();
					
					String nameOfMethod = libraryCreation.substring(0,libraryCreation.indexOf('('));
					String listOfArguments = libraryCreation.substring(libraryCreation.indexOf('(')+1,libraryCreation.indexOf(')'));
					String tabArguments[] = listOfArguments.split(",");
					try{
						int int1 = Integer.parseInt(tabArguments[1]);
						int int2 = Integer.parseInt(tabArguments[2]);
						int int3 = Integer.parseInt(tabArguments[3]);
						int int4 = Integer.parseInt(tabArguments[4]);
						libF.create_library(tabArguments[0],int1,int2,int3,int4);
						correctAnswer = true;
						System.out.println("the creation of the library was successful");
					}
					catch(Exception NumberFormatException){
						System.out.println("You must have entered the wrong type of data or the wrong number of arguments.");
					}
				}
			}
			catch(Exception InputMismatchException){
				System.out.println("That is not a possible choice, please try again");
			}
			
		}
		
		
		
		
		/*
		LibraryFactory libF = new LibraryFactory();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please call a method :");
		String calledMethod = sc.nextLine();
		
		String nameOfMethod = calledMethod.substring(0,calledMethod.indexOf('('));
		String listOfArguments = calledMethod.substring(calledMethod.indexOf('(')+1,calledMethod.indexOf(')'));
		String tabArguments[] = listOfArguments.split(",");
		
		
		if(nameOfMethod.equals("create_library")){
			try{
				int int1 = Integer.parseInt(tabArguments[1]);
				int int2 = Integer.parseInt(tabArguments[2]);
				int int3 = Integer.parseInt(tabArguments[3]);
				int int4 = Integer.parseInt(tabArguments[4]);
				libF.create_library(tabArguments[0],int1,int2,int3,int4);
				System.out.println("the creation of the library was successful");
			}
			catch(Exception NumberFormatException){
				System.out.println("You must have entered the wrong type of data or the wrong number of arguments.");
			}

			
		}
		
		else{
			System.out.println("You must have made a mistake in writing the method name. Please try again.");
		}
		*/
	


	}

}
