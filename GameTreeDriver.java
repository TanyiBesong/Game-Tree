//GameTreeDrivers.java
// Game Tree  Driver
// Date: 3/25/2021
// By: Tanyi Besong


import java.util.Scanner;

public class GameTreeDriver  {
	
	
	public static void main(String[] args) {
		
			GameTree myGameTree = new myGameTree(); // create game tree
			myGameTree.startGame("does it have legs?", "Cat" , "Snake" ); // call method to start game
			Scanner userInput = new Scanner(System.in);
 
			String response = "YES"; 
			
 
	while (response.equalsIgnoreCase("YES")) {   // begin outer loop
		
			System.out.println("Think of an animal and i will guess it.");
			myGameTree.newRound();
	
	while (myGameTree.isQuestion()) {  //begin inner loop
		
		System.out.println(myGameTree.getQuestion());
		 String response2 = userInput.nextLine();
		
	if (response2.equalsIgnoreCase("YES")) {
		
			myGameTree.moveYes();
			
	} else {
			myGameTree.moveNo();
		}
	} //end of inner while loop

		String answer = myGameTree.getAnswer(); // get answer from my game tree
		System.out.println("Is it a " + answer + "?");
	
				String res = userInput.nextLine();
	
		if(res.equalsIgnoreCase("YES")) {
			
				System.out.println("I win!" );
				
			} else {
			
				System.out.println("I give up. What is it? ");
				String response1 = userInput.nextLine();
			
			if(response1 != null) {
				
				System.out.println("Please type a question whose answer is yes for an " + response1 + " and no for a " + answer );
				String question = userInput.nextLine();
				myGameTree.setQuestion(question, response1); // add new question and answer to game tree
				
			} 
		
	}
	

		System.out.println("Continue?");
		response = userInput.nextLine();
		response.toUpperCase();
  
  
  
} //end of outer while loop
	
  		myGameTree.endGame(); //end game
  		userInput.close();
} 
}
