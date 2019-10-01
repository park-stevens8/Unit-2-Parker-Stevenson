import java.util.Scanner;

public class Assignment {

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter 3 integer values:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();


    double avg = (num1 + num2 + num3)/3;
    System.out.println("The average is:" + avg);

  }


}
