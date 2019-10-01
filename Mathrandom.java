import java.util.Random;


public class Mathrandom{

    public static void main(String []args){

      Random rand = new Random();


      System.out.println("[0,9}"+ rand.nextInt(10));
      System.out.println("[1,10]"+ (rand.nextInt(10) + 1));
      System.out.println("[20,34]"+ (rand.nextInt(15) + 20));
      System.out.println("[-10,9]"+ (rand.nextInt(20) - 10));
      System.out.println("[0,1]"+ rand.nextDouble());
      System.out.println("[0,6)"+ (rand.nextDouble()*6));

      System.out.println("[0,9]"+ (int) (Math.random()*10));
      System.out.println("[1,10]"+ (int) (Math.random()*10 + 1));
      System.out.println("[20,34]"+ (int) (Math.random()*15 + 20));
      System.out.println("[-10,9]"+ (int) (Math.random()*20 - 10));
      System.out.println("[0,1]"+ (Math.random()));
      System.out.println("[0,6]"+ (Math.random())*6);




    }
}
