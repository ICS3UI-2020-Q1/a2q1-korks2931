import java.util.Scanner;
/**
 * This program tells the user if a number is even or odd.
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);

    //declare a variable to store Remainder1
    //declare a variable to store Remainder2

    

    //prompt the user for the first number 
    
    System.out.println("Please enter an integer:");
    int number1 = input.nextInt();
     // define if the first number is odd or even 
    final int Remainder1 = number1 % 2;
    //check to see if the first number is an odd or an even number
    if(Remainder1 > 0){
      System.out.println(number1 + " is an odd number");
     

    } else {
      // tell the user it is an odd number
      System.out.println (number1 + " is an even number");
    }

    //prompt the user for the second number 
  
    System.out.println("Please enter an integer:");
    int number2 = input.nextInt(); 
    // define if the second number is odd or even 
    final int Remainder2 = number2 % 2;

     //check to see if the second number is an odd or an even number 
    
    

    if( Remainder2 > 0){ 
      System.out.println (number2 + " is an odd number");


    } else { 
      // tell the user it is an odd number 
      System.out.println (number2 + " is an even number");
    }


   
   
   
    
   


  }
}
