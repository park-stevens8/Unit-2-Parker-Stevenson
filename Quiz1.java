public class Quiz1{
  public static void main(String[] args){

    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";

    String sofia = firstName.substring(0,1);
    String maria = middleName.substring(0,1);
    String hernandez = lastName.substring(0,1);

    String initials = (sofia+maria+hernandez);

    String finished = initials.toLowerCase();

    System.out.println(finished);

  }


}
