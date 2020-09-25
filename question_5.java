package day4_Assignment_3ArithmeticOperators;

public class question_5 {

	public static void main(String[] args) {
		/*Write a program that outputs the number of hours, minutes, and seconds 
		 * that corresponds to input total seconds.
		 * -Declare int variables inputSeconds, hours, minutes, seconds
           -Initialize the inputSeconds
           -Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
           -Assign values to the hours, minutes, seconds variables
           -Display the result
     Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds*/
		
		int hours,minutes,seconds;
        int inputSecond=3695;
        hours =(inputSecond/3600)%24;
        minutes =(inputSecond/60)%60;
        seconds =(inputSecond/1)%60;
        System.out.println("inputSecond is " + inputSecond);
        System.out.println(hours +" hours " + minutes + " Minutes, and " + seconds + " seconds");
		
		
		
		
		
	
	}

}
