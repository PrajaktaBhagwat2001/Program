import java.util.*;
public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int digit,sum=0,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number for Sum: ");
        i=sc.nextInt();
        while(i>0) {
        	digit=i%10;
        	sum=sum+digit;
        	i=i/10;
        	
        }
        System.out.println("Sum of Given Numer is " +sum);
	}

}
