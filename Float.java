import java.util.Scanner;

public class Float {

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 floating point values:");
    float num1 = input.nextFloat();
    float num2 = input.nextFloat();


    float sum = (num1 + num2);
    System.out.println("The sum is:" + sum);
    float dif = (num1 - num2);
    System.out.println("The difference is:" + dif);
    float prod = (num1*num2);
    System.out.println("The product is:" + prod);
    float quot = (num1/num2);
    System.out.println("The quotient is:" + quot);

  }


}
