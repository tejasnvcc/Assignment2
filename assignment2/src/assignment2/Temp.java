import java.util.Scanner;
public class Temp 
{
	public static void main (String [] args)
	{
		double a[][]=new double[12][2];
		inputTempForMonth(a);
		inputTempForYear(a);
		calculateAverageHigh(a);
		calculateAverageLow(a);
		findHighestTemp(a);
		findLowestTemp(a);
		
		System.out.println("The Highest Temperature for the year is: " + Temp.findHighestTemp(a));
		System.out.println("The Lowest Temperature for the year is: " + Temp.findLowestTemp(a));
		
	}
	
	public static void inputTempForMonth (double tempArray[][])
	{
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int space = -1;
			for(int row=0;row<12;row++)
			{
	    		for(int col=0;col<1;col++)
	    		{
	    			counter++;
	    			space++;
	    			System.out.println("Enter high temperature for month " + counter + ": ");   
	    			tempArray[space][0]=input.nextDouble();
	    			System.out.println("Enter low temperature for month " + counter + ": ");
	    			tempArray[space][1]=input.nextDouble();
	    		}
			}
	}

	public static void inputTempForYear(double tempArray[][])
	{
		 String mon[] = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "Ocotober", "November", "December"};
		 
		 System.out.println ("\n\n");
			int counter = -1;
			
			for(int row= 0; row <12; row++)
			{
		    	for(int col= 0; col < 1; col++)
		    	{
		    		counter++;
		    		System.out.println(mon[counter]+ " has a High of " + tempArray[counter][0] + " and a Low of " + tempArray[counter][1]);
		    	}
		    }
	}

	public static void calculateAverageHigh(double tempArray[][])
	{
		double avgHigh = 0;
		int highNum = -1;
		
		for(int row = 0; row < 12; row++)
		{
			for(int col= 0; col < 1; col++)
			{
				highNum++;
				avgHigh += tempArray[highNum][0];
			}
		}
		System.out.println("\n\n");
		System.out.printf("The Average High Temperature is: " + "%.2f %n", (avgHigh/12));
	}
	
	public static void calculateAverageLow(double tempArray[][])
	{
		double avgLow = 0;
		int lowNum = -1;
		
		for(int row = 0; row < 12; row++)
		{
			for(int col= 0; col < 1; col++)
			{
				lowNum++;
				avgLow += tempArray[lowNum][1];
			}
		}
		
		System.out.printf("The Average Low Temperature is: " + "%.2f %n", (avgLow/12));
	}

	public static double findHighestTemp(double tempArray[][])
	{
		double findHighestTemp = tempArray[0][0];
		for(int col = 0; col < tempArray.length; col++)
		{
			for(int row = 0; row < tempArray[col].length; row++)
			{
				if(findHighestTemp < tempArray[col][row])
				{
					findHighestTemp = tempArray[col][row];
				}
			}
		}
		return findHighestTemp;
	}

	public static double findLowestTemp(double tempArray[][])
	{
		double findLowestTemp = tempArray[0][0];
		for(int col = 0; col < tempArray.length; col++)
		{
			for(int row = 0; row < tempArray[col].length; row++)
			{
				if(findLowestTemp > tempArray[col][row])
				{
					findLowestTemp = tempArray[col][row];
				}
			}
		}
		return findLowestTemp;
	}


}