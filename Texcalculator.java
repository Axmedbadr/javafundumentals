import  java.util.Scanner;
public class Texcalculator {
    public static void main(String[] args) {
    
        System.out.println("Please enter the total sale");
        Scanner input = new  Scanner(System.in);

        double taxInput =  input.nextDouble();
        double taxIs = taxInput * 0.05;
        System.out.println("you vat tax is $ :  " + (int) (taxIs * 100)/100.0);


        


    }
}
