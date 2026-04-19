import java.util.Scanner;

public class ComputeShilin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Qaado lacagta
        System.out.print("Geli lacag (Shilin), tusaale 1156: ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        // 1000 shilin
        int kun = remainingAmount / 1000;
        remainingAmount = remainingAmount % 1000;

        // 500 shilin
        int shanBoqol = remainingAmount / 500;
        remainingAmount = remainingAmount % 500;

        // 100 shilin
        int boqol = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // 50 shilin
        int konton = remainingAmount / 50;
        remainingAmount = remainingAmount % 50;

        // 10 shilin
        int toban = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // 1 shilin
        int hal = remainingAmount;

        // Output
        System.out.println("Lacagtaadu waxay ka kooban tahay:");
        System.out.println(kun + " kun shilin");
        System.out.println(shanBoqol + " shan boqol");
        System.out.println(boqol + " boqol");
        System.out.println(konton + " konton");
        System.out.println(toban + " toban");
        System.out.println(hal + " hal shilin");
    }
}