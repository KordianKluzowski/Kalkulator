import java.util.Scanner;

public class KalkulatorInformatyka {

	public static void main(String[] args) {
		 int liczba1;  
	       int liczba2;
	       char znak;      
	       Scanner wej = new Scanner(System.in);    
	       
	       System.out.println("Podaj pierwsz� liczb�:"); 
	       liczba1 = wej.nextInt();
	       System.out.println("Podaj drug� liczb�:");
	       liczba2 = wej.nextInt();
	 
	       System.out.println("Dodawanie dw�ch liczb - wci�nij +");
	       System.out.println("Odejmowanie dw�ch liczb - wci�nij -");
	       System.out.println("Mno�enie dw�ch liczb - wci�nij *");
	       System.out.println("Dzielenie dw�ch liczb - wci�nij /");
	       System.out.println("Reszta z dzielenia - wci�nij %");
	 
	       znak = wej.next().charAt(0);  
	       switch(znak)     
	       {
	           case '+':    
	           {
	               System.out.println(liczba1 + liczba2);
	               break;
	           }
	           case '-':    
	           {
	               System.out.println(liczba1 - liczba2);
	               break;
	           }
	           case '*':    
	           {
	               System.out.println(liczba1 * liczba2);
	               break;
	           }
	           case '/':  
	           {          
	               if(liczba2 !=0)
	               {
	                 System.out.println(liczba1 / liczba2 + "oraz reszty: " +
	                		 liczba1 % liczba2);
	               }
	               else
	               {
	                   System.out.println("Nie dzielimy przez zero!!!");
	               }
	               break;
	           }
	           case '%':  
	           {
	               if(liczba2 !=0)  
	               {
	                   System.out.println(liczba1 % liczba2);
	               }
	               else
	               {
	                   System.out.println("Nie dzielimy przez zero!!");
	               }
	           }
	 
	       }
	 

	}

}
