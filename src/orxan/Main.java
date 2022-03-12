package orxan;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("reqem daxil edin");
	    
		int number = scanner.nextInt();
        int multiply =1;
        int sum = 0;
        
        
        while(number != 0)
        {
          sum=(number%10)+sum;
          multiply=(number%10)*multiply;
          number /= 10;
          
        }
      
        System.out.println("reqemlerinin cemi" +" " +sum);
        System.out.println("reqemlerinin hasili" +" " + multiply);
        if(sum==multiply){
            System.out.println("reqemlerinin cemi hasiline beraberdir ");
        }else{
            System.out.println("reqemlerinin cemi hasiline beraber deyil");
        };
 
	}
}