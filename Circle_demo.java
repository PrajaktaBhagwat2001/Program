import java.util.*;
public class Circle_demo {
	static private int r  ;
	static private double pi = 3.14;
	public int get_method() {
		return r;
		 }
	public void set_method(int a) {
	    this.r=a;
	 }
	
	public double get_method(double p) {
		return p;
		}
	
	public void set_method(double p) {
		this.pi=p;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle: ");
		r= sc.nextInt();
		System.out.println("Area of Circle is : "+pi*r*r);
	}

	}
