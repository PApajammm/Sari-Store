package coditions;
import java.util.*;
public class Store {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		
		
		System.out.println("WElCOME TO SARI STORE!!");
		System.out.println(" ");
		
		System.out.println("How Can I help you?");
		System.out.println("");
		System.out.println("Here's the Menu in this Store");
		System.out.println("");
		
		System.out.println("Ballpen      ₱11    ");
		System.out.println("Bond Paper   ₱2     ");
		System.out.println("Eraser       ₱15    ");
		System.out.println("Calculator   ₱75    ");
		System.out.println("NoteBook     ₱45    ");
		System.out.println("Pencil       ₱12    ");
		System.out.println("Bag          ₱370   ");
		System.out.println("Manila Paper ₱20    ");
		System.out.println("Shoes        ₱500   ");
		System.out.println("Pants        ₱340   ");
		System.out.println("Polo         ₱700   ");
		System.out.println("Short        ₱300   ");
		System.out.println("");
		
		System.out.print("Enter Name (nickname):");
		String name =scan.nextLine();
		
		System.out.print("Enter age:");
		int age =scan.nextInt();
		
		if(age >= 18) {
			System.out.println("(Adult) " + age);
			
		}else {
			System.out.println("(Minor) " + age);
		}
		
		System.out.println("");
		
		System.out.println("Your Name is " + name + " and your age  is " + age + "!" );
		
		System.out.println("");
		
		
		
		System.out.print("What item would you like to buy?:");
		String item =scan.next();
		
		System.out.print("Put your money");
		int m =scan.nextInt();
		
		
		
		System.out.println("");
		
       int Ballpen      = 11;
       int Bond_Paper   = 2;
       int Eraser       = 15;
       int Calculator   = 75;
       int NoteBook     = 45;
       int Pencil       = 12;
       int Bag          = 370;
       int Manila_Paper = 20;
       int Shoes        = 500;
       int Pants        = 340;
       int Polo         = 700;
       int Short        = 300;
       
       if(item.equals("Ballpen")) {
    	   System.out.println("Your Change is " + (m-=Ballpen));
      
       }else if(item.equals("Bond Paper")) {
    	   System.out.println("Your Change is " + (m-=Bond_Paper));
      
       
       } else if(item.equals("Eraser")) {
    	   System.out.println("Your Change is " + (m-=Eraser));
      
       
       }  else if(item.equals("Calculator")) {
    	   System.out.println("Your Change is " + (m-=Calculator));
      
       
       }  else if(item.equals("NoteBook")) {
    	   System.out.println("Your Change is " + (m-=NoteBook));
      
       
       }  else if(item.equals("Pencil")) {
    	   System.out.println("Your Change is " + (m-=Pencil));
      
       
       }  else if(item.equals("Bag")) {
    	   System.out.println("Your Change is " + (m-=Bag));
      
       
       }  else if(item.equals("Manil Paper")) {
    	   System.out.println("Your Change is " + (m-=Manila_Paper));
      
       
       }  else if(item.equals("Shoes")) {
    	   System.out.println("Your Change is " + (Shoes));
      
       
       }    else if(item.equals("Pants")) {
    	   System.out.println("Your Change is " + (m-=Pants));
      
       
       }    else if(item.equals("Polo")) {
    	   System.out.println("Your Change is " + (m-=Polo));
      
       
       }    else if(item.equals("Short")) {
    	   System.out.println("Your Change is " + (m-=Short));
    	   
       }
       
    	   System.out.println("");
    	   System.out.println("Thank You  So Much Sir " + name +"!");
    	   System.out.println("Come again and Have a nice day!");
    	   
       
           
	}

}
