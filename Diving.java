import java.util.*;
/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
The highest and lowest scores are thrown out and the remaining scores are added together. 
The sum is then multiplied by the degree of difficulty for that dive. The degree of difficulty ranges from 1.2 to 3.8 points.
The total is then multiplied by 0.6 to determine the diver’s score.
Write a computer program that will ultimately determine the diver’s score. This program must include the following methods:

Algorithm for Calculating Score:
[(Sum of 7 Scores) - min - max] * Degree of Difficulty * .6

*/
public class Diving
{
   //instant Variable
   public double[] scores;
   public double max;
   public double sum;
   public double difficulty;
   public double finalscore;
   public int index;
   
   public Scanner keyboard;
   
   
   //Prompts User to input the score of the judges
   public void inputValidScores()
   {
      double[] scores = new double[7];
      System.out.println("Enter the Score's for the 7 Judges");
      Scanner keyboard = new Scanner(System.in);
      max = scores[0];
      for (index = 0; index < 7; index++) // finding the max and min number of 7 scores
      {
         scores[index] = keyboard.nextDouble();
         if (scores[index] > max)
         max = scores[index];
      }
      
      Arrays.sort(scores);
      for (int i = 0; i < scores.length; i++)
      {
         sum = sum + scores[i];
      }
      double S0 = scores[0];
      double S1 = scores[1];
      double S2 = scores[2];
      double S3 = scores[3];
      double S4 = scores[4];
      double S5 = scores[5];
      double S6 = scores[6];
      //Algorithm to solve the total score with the Degree of Difficulty.
      finalscore = ((((sum - scores[0]) - scores[6]) * difficulty) * 0.6);
      System.out.println("The Final Score for the Diver's Dive = " + finalscore);
   }
   
   //User input's the Degree of Difficulty
   public void inputValidDegreeOfDifficulty()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the Degree of Difficulty for Diver jump: ");
      difficulty = keyboard.nextDouble();
   }
   
   //Main Method that calls upon the above methods
   public static void main(String[] args)
   {
      Diving aDiving = new Diving();
      aDiving.inputValidDegreeOfDifficulty();
      aDiving.inputValidScores();
      
      
   }
   
     
}
