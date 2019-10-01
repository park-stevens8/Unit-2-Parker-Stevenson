import java.lang.Math;
import java.util.Random;

public class WeekTwo{

  public static void main(String []arcs){

    Random digit = new Random();

    int area1 = (digit.nextInt(8) + 2);
    int area2 = (digit.nextInt(9));
    int area3 = digit.nextInt(10);

    int ex1 = (digit.nextInt(8) + 2);
    int ex2 = digit.nextInt(10);
    int ex3 = digit.nextInt(10);

    int last1 = digit.nextInt(10);
    int last2 = digit.nextInt(10);
    int last3 = digit.nextInt(10);
    int last4 = digit.nextInt(10);


    System.out.println(area1+area2+area3+"-"+ex1+ex2+ex3+"-"+last1+last2+last3+last4);







  }

}
