
import java.util.Scanner;

public class Studentinformation {
    public static void main(String[] args) {
        System.out.println("Please enter student Information : StudentForm");
        
        Scanner input = new Scanner(System.in);

         
        System.out.println("Please enter student id : ");
        int studentid = input.nextInt();
            System.out.println("Please enter fuculty id : ");
        int fucultyid = input.nextInt();
            System.out.println("Please enter courseid : ");
             int semesterid = input.nextInt();
            System.out.println("Please enter semester id : ");
        int courseid = input.nextInt();
            System.out.println("Please enter marks student : ");
        int marks = input.nextInt();

        System.out.println( "the information of student is : "  
         +  "student id is : " +  " " + studentid  + 
          "  "+  "and his semeter id is : "
        + semesterid  + " "+ " and his fuculty  id is : " +  
        " " + fucultyid   +  " " + "course id is : " + courseid  +
         " " + "marks students  : " + marks);
        

        



    }
    
}
