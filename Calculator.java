package conditional;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner ca = new Scanner(System.in);
          System.out.println("Enter operation : ");
          char operation = ca.nextLine().charAt(0);
          System.out.println("Enter a :  ");
          int a = ca.nextInt();
          System.out.println("Enter b :  ");
          int b = ca.nextInt();
          int utar = 0;
          switch(operation)
          {
          case '+' :
        	  utar = a + b ;
        	  break;
          case '-' :
        	  utar = a - b ;
        	  break;
          case '*' :
        	  utar = a * b ;
        	  break;
          case '/' :
        	  utar = a / b ;
        	  break;
        	  default :
        		  System.out.println("invalid operation : ");
          }
          System.out.println("result is :  " +utar);
          
          
	}

}
