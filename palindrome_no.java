import java.util.*;
public class palindrome_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no ,rev=0,rem;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Integer nalue for Checking Palindrome: " );
        no = sc.nextInt();
        int temp=no;
        while(temp!=0) {
        	rem= temp%10;
        	rev=rem*10+rem;
        	temp=temp/10;
        }
        if(no==rev) { 
        	System.out.println(no+" is Palindrome");
        }
        else {
        	System.out.println(no+" is not Palindrome");
	}
	}
}
