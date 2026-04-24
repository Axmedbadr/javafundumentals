import java.util.Scanner;

public class ComputeShilin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      
        System.out.print("Geli lacag (Shilin ahaan), tusaale 1456: ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        int kun = remainingAmount / 1000;
        remainingAmount = remainingAmount % 1000;

     
        int shanBoqol = remainingAmount / 500;
        remainingAmount = remainingAmount % 500;

    
        int boqol = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

     
        int konton = remainingAmount / 50;
        remainingAmount = remainingAmount % 50;

   
        int toban = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

  
        int hal = remainingAmount;

        System.out.println("Lacagtaadu waxay ka kooban tahay:");
        System.out.println(kun + " kun shilin");
        System.out.println(shanBoqol + " shan boqol");
        System.out.println(boqol + " boqol");
        System.out.println(konton + " konton");
        System.out.println(toban + " toban");
        System.out.println(hal + " hal shilin");
    }
}