import java.util.Scanner;

public class Distance {

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 coordinate pairs (1,2), (3,4)");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int num4 = input.nextInt();

//Distance = [(x2 - x1)^2 + (y2 - y1)^2]^0.5
    double dif1 = (num2 - num1);
    double dif2 = (num4 - num3);
    double pow1 = Math.pow(dif1,2.0);
    double pow2 = Math.pow(dif2,2.0);

    double sumpow = (pow1 + pow2);
    double distance = Math.pow(sumpow,0.5);

    System.out.println("The distance between the two points is " + distance);


  }


}
