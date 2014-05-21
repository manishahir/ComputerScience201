import java.util.Scanner;

public class ComputerConfiguration
{
   
   public static void main(String[] args)
   {
      System.out.println("Hello let us look at the Statistics of your current Computer");
      System.out.println("Model: Lenovo Flex 2");
      
      //price from intel.com and newegg.com
      String cpu = "Intel Core i5-4210U";
      double cpuPrice = 281.00;
      
      String ram = "4.0GB PC3-12800";
      double ramPrice = 50.00;
      
      String hddrive = "Hybrid 500GB";
		double hddrivePrice = 118.01;
      
		String audiocard = "Dolby® Advanced Audio™";
		double audiocardPrice = 0.00;
      
		String gpu = "Integrated Intel® HD Graphics 4400";
		double gpuPrice = 99.99;
      
		String speakers = "Stereo Speakers";
		double speakersPrice = 30.00;
      
      double totalPrice = cpuPrice + ramPrice + hddrivePrice + audiocardPrice + gpuPrice + speakersPrice;
      
      //using printf to control the formating of the text
      
      System.out.printf("%-35s %-35s %-35s\n", "Part", "Part Type", "Price");
      System.out.printf("%-35s %-35s $%-35.2f\n", cpu, "CPU", cpuPrice);
      System.out.printf("%-35s %-35s $%-35.2f\n", ram, "RAM", ramPrice);
		System.out.printf("%-35s %-35s $%-35.2f\n", hddrive, "Hard Drive", hddrivePrice);
		System.out.printf("%-35s %-35s $%-35.2f\n", audiocard, "Audio Card", audiocardPrice);
		System.out.printf("%-35s %-35s $%-35.2f\n", gpu, "Graphics Card", gpuPrice);
		System.out.printf("%-35s %-35s $%-35.2f\n\n", speakers, "Speakers", speakersPrice);
		System.out.println("Your current Computer costs: " + totalPrice);
      
      System.out.println("Not bad but lets take a look and see if we can upgrade your computer.");
      
      String cpuNew = "Intel Core i7-4600U"; // $339.99
		String ramNew = "12GB DDR3L SDRAM 1600 MHz"; // $199.99
		String hddriveNew = "1.316TB SSD M.2"; // $699.99
		String audiocardNew = "Dolby® Home Theater® v4"; // $50.00
		String gpuNew = "NVIDIA GtForce GTX 780"; // $510.00
		String speakersNew = "BOSE® 354495-1100"; // $99.99
      
      
      Scanner input = new Scanner(System.in);
		System.out.println("Price for : " + cpuNew);
		double cpuPriceNew = input.nextDouble();
		System.out.println("Price for : " + ramNew);
		double ramPriceNew = input.nextDouble();
		System.out.println("Price for : " + hddriveNew);
		double hddrivePriceNew = input.nextDouble();
		System.out.println("Price for : " + audiocardNew);
		double audiocardPriceNew = input.nextDouble();
		System.out.println("Price for : " + gpuNew);
		double gpuPriceNew = input.nextDouble();
		System.out.println("Price for : " + speakersNew);
		double speakersPriceNew = input.nextDouble();
		double totalNew = cpuPriceNew + ramPriceNew + hddrivePriceNew + audiocardPriceNew + gpuPriceNew + speakersPriceNew;
		input.close();
      
      System.out.println("Here are the Stats of your new PC:");
      
      System.out.printf("%-35s %-35s %-35s\n", "Part", "Part Type", "Price");
      System.out.printf("%-35s %-35s $%-35.2f\n", cpuNew, "CPU", cpuPriceNew);
      System.out.printf("%-35s %-35s $%-35.2f\n", ramNew, "RAM", ramPriceNew);
		System.out.printf("%-35s %-35s $%-35.2f\n", hddriveNew, "Hard Drive", hddrivePriceNew);
		System.out.printf("%-35s %-35s $%-35.2f\n", audiocardNew, "Audio Card", audiocardPriceNew);
		System.out.printf("%-35s %-35s $%-35.2f\n", gpuNew, "Graphics Card", gpuPriceNew);
		System.out.printf("%-35s %-35s $%-35.2f\n\n", speakersNew, "Speakers", speakersPriceNew);
		System.out.println("Your NEW UPGRADED Computer costs: " + totalNew);
      
      
   }
}
