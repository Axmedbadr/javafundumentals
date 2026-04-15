import  java.util.Scanner;
public class Texcalculator {
    public static void main(String[] args) {
    
        System.out.println("Please enter the total sale");
        Scanner tax = new  Scanner(System.in);

        double taxInput =  tax.nextDouble();
        double taxIs = taxInput * 0.05;
        System.out.println("you vat tax is  " +taxIs);


        


    }
}
