import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CalculatorTools{

	public static int makiCalc(ArrayList<Integer> Maki, int playerCount) {
		int makiWinner=12;
		
		for(int i=0; i<playerCount;i++) {
			if(Maki.get(i)==Collections.max(Maki) && makiWinner>=0) {
				
				makiWinner = makiWinner/2;
			}
		}

		return makiWinner;
	}
	
	public static int PuddingCalc(ArrayList<Integer> Puddings, int playerCount) {
		int puddingWinner=12;
		
		for(int i=0 ; i < playerCount ; i++) {
			if(Puddings.get(i)==Collections.max(Puddings) && puddingWinner>=0) {
				
				puddingWinner = puddingWinner/2;
			}
		}
		
		return puddingWinner;
		
	}

	public static int variableCleanUp(int variable){

		
		Scanner dirt = new Scanner(System.in);
		int cleanVariable = variable;
		
		
		try {
			cleanVariable = Integer.parseInt(dirt.nextLine());
		}
		catch(NumberFormatException e) {
			System.out.println("\nInvalid Selection, please enter an integer.\n");
		}
		
		
		return cleanVariable;
	}

	public static ArrayList<Integer> scoreBoard(ArrayList<Integer> scoreBoard) {

		Collections.sort(scoreBoard);
	    Collections.reverse(scoreBoard);
    
		return scoreBoard;
	}
	
}
