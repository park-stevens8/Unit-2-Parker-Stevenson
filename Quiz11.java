import java.util.Random;
import java.util.Scanner;


public class Quiz11{
  public static void main(String[] args){
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter and integer between 1 and 10");
    int usernum = input.nextInt();
    int randnum = (rand.nextInt(101));
    int lucky = (usernum - randnum);

    System.out.println("Your lucky number is "+lucky);

  }


}
