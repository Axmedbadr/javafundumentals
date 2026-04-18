import  java.util.Scanner;

public class Timerconverter {
     

    public static void main(String[] args) {
    
        Scanner  input = new Scanner(System.in);
        System.out.println("please enter seconds to  convert minutes");
        int secondsUserenters = input.nextInt();
        int minutes = secondsUserenters / 60;
        int remainingSeconds = secondsUserenters % 60;

       
       System.out.println( minutes + " "+ " minutes " + " " + remainingSeconds + " " + "seconds" );
    }   
    
}
