// GameTree.java
// Game Tree Interface
// Date: 3/25/2021
// By: Tanyi Besong

public interface GameTree {
	
	public void startGame(String question, String yesAnswer, String noAnswer);
	// Starts playing the game by creating a game tree of three nodes.  
	// The root contains the question, the root's left child contains the yesAnswer,
	// and the root's right child contains the noAnswer.
	// Precondition: question is the question to ask.
	//               yesAnswer is the answer to the question for yes.
	//               noAnswer is the answer to the question for no.  
	// Postcondition: A minimal game tree is created.
	// Throws: None.

	public void newRound();
	// Starts a new round of the game.
	// Precondition: A game tree exists. 
	// Postcondition: Current position in the game tree is (re)set to the root.
	// Throws: None.
		
	public void endGame();
	// Ends the game.
	// Precondition: None. 
	// Postcondition: A message is printed to indicate end of game.
	// Throws: None.
	
	public void moveYes() throws TreeException;
	// Moves to next step if the user answers yes.
	// Precondition: None. 
	// Postcondition: None.
	// Throws: TreeException is thrown if not able to move to next step.

	public void moveNo() throws TreeException;
	// Moves to next step if the user answers no.
	// Precondition: None. 
	// Postcondition: None.
	// Throws: TreeException is thrown if not able to move to next step.

	public String getQuestion() throws TreeException;
	// Obtains current question from the game tree.
	// Precondition: Current node should contain a question. 
	// Postcondition: Current question is returned.
	// Throws: TreeException is thrown if not able to get question.

	public void setQuestion(String question, String answer);
	// Sets the question provided by the player into the game tree.
	// Precondition: question is the question entered by the player.
	//               answer is the correct answer provided by the player.              
	// Postcondition: The question and answers are set up correctly.
	// Throws: None.

	public String getAnswer() throws TreeException;
	// Obtains current answer from the game tree.
	// Precondition: Current node should contain an answer. 
	// Postcondition: Current question is returned.
	// Throws: TreeException is thrown if not able to get answer.

	public boolean isQuestion();
	// Checks if current node is question node
	// Precondition: None. 
	// Postcondition: Returns true if current node is question node.
	// Throws: None.
	
}
