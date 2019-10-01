import java.util.Scanner;

public class Clock {

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a time 1:2:3");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();


    int minutes = (num2)*60;
    int hours = (num1)*3600;
    int seconds = (minutes + hours + num3);
    System.out.println("This total seconds:" + seconds);


  }
}
