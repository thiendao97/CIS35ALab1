import java.util.Scanner; //scanner class will help read keyboard input from the user

public class DigitsSum 
{	
	public static void main(String[] args)
	{ 
		while(true) 
		{
			Scanner in = new Scanner(System.in);  
			Scanner yesno = new Scanner(System.in);
			System.out.print("Please input a number \n"); //Display prompt. This will let user input a number. Make sure not to use println refer to pg 51

			int usernum = in.nextInt(); //user's input number
			int separateDigit = 0; // separated digit from the user's integer
			int sumofDigit = 0; //sum will start at 0 and will change when it keeps adding depending on the amount of digits and its value
		
			while (usernum > 0) //as long as integer is greater than zero keep doing this
			{
				separateDigit = usernum % 10; //this will separate the digit in the last position
				sumofDigit += separateDigit; //this is the formula which will add all the digits. Also found a shorter version of sumofdigits = sumofdigits + usernum
				usernum = usernum / 10; //this will remove the digit in the last position. Using recursion it will repeat until no more digits remain since it will terminate once total integer is less than 0
			} 
			
			System.out.println("The sum of all digits in the integer is \n" + sumofDigit); //this will give the output to the user
			
			// Ask if the user wants to continue again.
			
			while (true) 
			{
				System.out.println("Do you want to continue again? (Y/N)");
				String choice = yesno.nextLine(); // nextLine() takes a user string as input
				
				// System.out.println("You entered: " + choice); // This was for debugging
				
				if (choice.equals("N")) // This compares two strings. The string that the user entered. and the string "N" if they are both equal the program exits.
				{
					System.out.println("GoodBye!");
					System.exit(0);
				}
				else if (choice.equals("Y")) 
				{
					break; // This exits the second while loop
				}
				else {
					System.out.println("Invalid input please try again.");
				}
			}
		}
	}
}


			

	

