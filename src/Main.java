import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gallons = 0;
        double gasPrice = 0;
        double fuelEff = 0;
        String trash = "";
        System.out.println("How many gallons of gas are in your tank: ");
        gallons = in.nextInt();

        System.out.println("What is the fuel efficiency of your car: ");
        fuelEff =  in.nextDouble();

        System.out.println("What is the price of gas per gallon: ");
        gasPrice = in.nextDouble();

        System.out.println("If driving 100 miles, you will spend roughly "+ (gasPrice *100));

        System.out.println("It'll take you " + (fuelEff * gallons) + " miles before you run out of gas.");


    }
}