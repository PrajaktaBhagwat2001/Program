import java.util.*;
public class Array_Deque_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayDeque<String> ad1=new ArrayDeque<>();// creating empty array deque
        
        ad1.add("67");
        ad1.add("90");
        ad1.add("45");
        ad1.add("23");
        ad1.add("67");
        ad1.push("Riya");
        ad1.iterator();
        System.out.print("Elements of Array Deque: "+ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        ad1.addLast("60");
        System.out.println(ad1);
        ad1.removeFirst();
        System.out.println(ad1);
        
	}
	

}
