import java.util.*;
public class factorial_demo {
	static int Fact(int n) {
	 if(n==0 || n==1) 
		return 1;
	 else {
		 int factorial = n*Fact(n-1);
		 return factorial;}
		 
	 }
	static int fact_Iterative(int n)
	{  
		if(n==0 || n==1) 
			return 1;
		 else {
			int mul =1;
			for(int i=1;i<=n;i++) {
			    mul =mul*i;
				}
			return mul;
			}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter any Value for Calculation of factorial: ");
		int x  =sc.nextInt();
        System.out.println("They Factorial of "+x+" is: " +Fact(x));
        System.out.println("They Factorial(By using Iteratation) of "+x+" is: " +fact_Iterative(x));
        
	}

}
