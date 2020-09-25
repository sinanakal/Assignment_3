package day4_Assignment_3ArithmeticOperators;

public class question_6 {

	public static void main(String[] args) {
		/*Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
         Write a program with a variable that holds the number of milligrams of caffeine in a drink and 
         outputs how many drinks it takes to kill a person.
Sample Output
            Number of milligrams in drink: 500
            It would take about 20 drinks for a lethal overdose*/
		
	
		
		int mgCafein = 500;
		int lethalOverDose = 10000;
		
		int dosesToKill= lethalOverDose/mgCafein;
		
		System.out.println("Number of miligrams in drink: "+mgCafein);
		System.out.println("It would take about "+dosesToKill+" drinks for a lethal overdose");
		
		
		
	  }
    }
		
		
		
		
		
		
		
		


