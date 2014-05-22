import java.util.*;
/*
A troop of Girl Scouts is selling boxes of cookies. 
The leader of the Girl Scout troop wants to know how 
many girl scouts sold boxes of cookies in the following ranges:

0 to 10 boxes
11 to 20 boxes
21 to 30 boxes
31 to 40 boxes
41 or more boxes
*/
public class GirlScoutCookies
{
   public static void main(String[] args)
   {
      //User input's how many cookies were sold for each girl.
      int[] numberOfCookiesSold = new int[8];
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter Number of Girl Scout Cookies Each Scout Sold: ");
      for (int index = 0; index < numberOfCookiesSold.length; index++)
      {
         numberOfCookiesSold[index] = keyboard.nextInt();   
      }
      
      //Variables to count how many of each were sold.
      int how_many1_10 = 0;
      int how_many11_20 = 0;
      int how_many21_30 = 0;
      int how_many31_40 = 0;
      int how_many41Over = 0;
      
      /*have to pass it through a for loop and look at each number with the if/else statements
      If/Else statements check how many each girl sold while sorting them into 5 different categories:
      
      1-10
      11-20
      21-30
      31-40
      41+
      */
      for (int i=0; i < numberOfCookiesSold.length; i++ )
      {
         
         if (numberOfCookiesSold[i] > 1 && numberOfCookiesSold[i] <= 10)
         {
            how_many1_10 +=1;
         }
         else if (numberOfCookiesSold[i] > 10 && numberOfCookiesSold[i] <= 20)
         {
            how_many11_20 +=1;
         }
         else if (numberOfCookiesSold[i] > 20 && numberOfCookiesSold[i] <= 30)
         {
            how_many21_30 +=1;
         }
         else if (numberOfCookiesSold[i] > 30 && numberOfCookiesSold[i] <= 40)
         {
            how_many31_40 +=1;
         }
         else
         {
            how_many41Over +=1;   
         }
      
      }
      /*
      Prints out the number of girl scouts who sold a certain amount of cookies. 
      While formatting it to look like a list.
      */
      System.out.printf("%-15s %-15s\n", "Total Boxes", "Number of Girl Scouts");
      System.out.printf("%-15s %-15s\n", "0 to 10", how_many1_10);
      System.out.printf("%-15s %-15s\n", "11 to 20", how_many11_20);
      System.out.printf("%-15s %-15s\n", "21 to 30", how_many21_30);
      System.out.printf("%-15s %-15s\n", "31 to 40", how_many31_40);
      System.out.printf("%-15s %-15s\n", "41 and Over", how_many41Over);
   }
}
