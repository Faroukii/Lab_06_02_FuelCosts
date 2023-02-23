import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gallons = 0;
        double gasPrice = 0;
        double fuelEff = 0;
        String trash = "";
     //giving all the variables values
        System.out.println("How many gallons of gas are in your tank: ");
        //Asking how many gallons of gas your car can hold
        if (in.hasNextInt()) {
            gallons = in.nextInt();
            System.out.println("What is the fuel efficiency of your car: ");
            //Asking the MPG
            if (in.hasNextDouble())
            {
                fuelEff = in.nextDouble();
                System.out.println("What is the price of gas per gallon: ");
                //Asking the price per gallon
                if (in.hasNextDouble())
                {
                    gasPrice = in.nextDouble();
                    System.out.println("If driving 100 miles, you will spend roughly " + (gasPrice * 100));
                    System.out.println("It'll take you " + (fuelEff * gallons) + " miles before you run out of gas.");
                    //Here is where we make the formula
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("Please enter correct value: " + trash);
                    //Trash if inputted incorrect value for gas tank
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter correct value: " + trash);
                //Trash if inputted incorrect value for MPG
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Please enter correct value: " + trash);
            //Trash if inputted incorrect value for price per gallon
        }
    }
}