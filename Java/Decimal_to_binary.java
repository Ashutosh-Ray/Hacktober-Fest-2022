package Test;

import java.util.Scanner;
import java.util.Stack;

public class Decimal_to_binary {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter decimal number: ");
	    num= sc.nextInt();
	    deciToBinary(num);

	}

	private static void deciToBinary(int n) {
		Stack<Integer> s = new Stack<Integer>();
	    while(n!=0)
	    {
	        s.push(n%2);
	        n=n/2;
	    }
	    while(!s.empty())
	    {
	        System.out.println(s.pop());
	    }
		
	}

}
