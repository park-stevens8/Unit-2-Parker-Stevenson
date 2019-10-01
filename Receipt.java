import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
//Created by Parker Stevenson and Luke Hashbarger
public class Receipt{
    public static void main(String []args){
      Random rand = new Random();
      Scanner input = new Scanner(System.in);
      DecimalFormat fmt = new DecimalFormat("##.00");

      System.out.println("Number of books bought: ");
      int BooksBought = input.nextInt();
      System.out.println("Number of movies bought");
      int MoviesBought = input.nextInt();
      System.out.println("Pounds of peanuts bought");
      double PeanutsBought = input.nextDouble();

      int month = rand.nextInt(13);
      int days = (rand.nextInt(29));
      int years = (19);

      int hours = (rand.nextInt(25));
      int minutes = (rand.nextInt(60));
      int seconds = (rand.nextInt(60));

      String date = new String(month + "/" + days + "/" + years);
      String time = new String(hours + ":" + minutes + ":" + seconds);

      double books = 9.0;
      double movies = 13.97;
      double peanuts = 1.72;

      double shipbook = 0.95;
      double shipmovies = movies * 0.04;
      double shippeanuts = 0.30;
      double tax = 0.072;

      double bookstotaltax = (books * BooksBought * tax);
      double bookstotalship = (shipbook * BooksBought);
      double bookssubtotal = (books * BooksBought) + (shipbook * BooksBought);


      double moviestotaltax = (movies * MoviesBought * tax);
      double moviestotalship = (shipmovies * MoviesBought);
      double moviesubtotal = (movies * MoviesBought) + (shipmovies * MoviesBought);

      double peanutstotal = (peanuts * PeanutsBought);
      double peanutstotalship = (shippeanuts * PeanutsBought);


      double totalshipnr = (bookstotalship + moviestotalship + peanutstotalship);
      double totalshipround = (Math.round(totalshipnr * 100.0)/ 100.0);

      double totalsub = (moviesubtotal + bookssubtotal + peanutstotal);
      double subtotalrnd = (Math.round(totalsub * 100.0)/ 100.0);

      double taxnr = (moviestotaltax + bookstotaltax);
      double taxrnd = (Math.round(taxnr * 100.0)/ 100.0);

      double grandtotal = (totalsub + totalshipnr + taxnr);
      double grandtotalrnd = (Math.round(grandtotal * 100.0)/ 100.0);

      String name = new String("Steve's S-Mart");
      System.out.println("------------------------------");
      System.out.println("| "+ name);
      System.out.println("| "+ time);
      System.out.println("| "+ date);
      System.out.println("|");
      System.out.println("| Books: "+ BooksBought);
      System.out.println("| Movies: "+ MoviesBought);
      System.out.println("| Peanuts: "+ PeanutsBought + " lbs");
      System.out.println("|");
      System.out.println("| Subtotal: " + (subtotalrnd));
      System.out.println("| Shipping: " + (totalshipround));
      System.out.println("| Tax: " + (taxrnd));
      System.out.println("|");
      System.out.println("|");
      System.out.println("| Grand Total: " + (grandtotalrnd));
      System.out.println("|");
      System.out.println("|");
      System.out.println("| Your Cashier: Joe Mama");
      System.out.println("------------------------------");










    }

}
