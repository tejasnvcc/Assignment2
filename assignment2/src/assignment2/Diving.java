package assignment2;

import java.util.Scanner;
public class Diving
{
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        double [] set = inputAllScores();
        //set = inputAllScores();
        //System.out.println("Enter " + calcScore.length + " calcScore.");
        //calcScore[0] = keyboard.nextDouble();
        //double maximum = calcScore[0];
        //for (int index = 1; index < 7; index++)
        //{
        //    calcScore[index] = keyboard.nextDouble();
        //    if (calcScore[index] > maximum)
        //    	{maximum = calcScore[index];}
        //}
        //Arrays.sort(calcScore);
        double DegreeOfDifficulty = inputValidDegreeOfDifficulty();
        double calcScore = calculateScore(DegreeOfDifficulty, set);
        System.out.printf("The final score of the diver is " + "%.2f %n", calcScore);
    }

	public static double inputValidScore(int i){
		int check = -1;
		double calcScore=0;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.println("Enter score for " + i + ":");
			calcScore = keyboard.nextDouble();
			if ((calcScore <= 10) && (calcScore >= 0))
					check = 0;
			else System.out.println("Enter in a range from 0 to 10.");
		  }while (check <= -1);
		
		return calcScore;
	}
	public static double [] inputAllScores(){
		double[] set = new double[7];
		
		for(int i=0; i<7; i++){
			set[i]=inputValidScore(i);
		   }
		
        return set;
	}
	public static double inputValidDegreeOfDifficulty(){
		int check = -1;
		double DegreeOfDifficulty = 0;
		
		do{
			System.out.println("Enter the degree of difficulty.");
			DegreeOfDifficulty = keyboard.nextDouble();
			if ((DegreeOfDifficulty <= 3.8) && (DegreeOfDifficulty >= 1.2))
					check = 0;
			else System.out.println("Enter in a range from 1.2 to 3.8.");
		  }	while (check <= -1);
		
		return DegreeOfDifficulty;
	}
	public static double calculateScore(double DegreeOfDifficulty, double[]set){
		double total, scoreMin = set[0], scoreMax = set[0];
		double temptotal = 0;
		for(int i=0; i < 7; i++)
		{
			if (set[i] < scoreMin);
				scoreMin = set[i];
			if (set[i] >scoreMax)
				scoreMax = set[i];
		}
		System.out.println(scoreMin);
		System.out.println(scoreMax);
		System.out.println(DegreeOfDifficulty);
		
		for(int i=0; i < 7; i++)
		{
			temptotal += set[i];
		}
		System.out.println(temptotal);
		total = (temptotal - scoreMin - scoreMax) * .60 * DegreeOfDifficulty;
		return total;
	 } 
}