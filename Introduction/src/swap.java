import java.util.Scanner;

//nilesh kishor khandwe

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x , y , temp ;
		
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		x= in.nextInt();
		y= in.nextInt();
		
		System.out.println("Before swapping"+x +y);
		
	/*	temp = x;
		x=y;
		y=temp;  */
		
		x= x+y;
		y=x-y;
		x=x-y;
		
		
		System.out.println("After swapping" +x +y);
		
	}

}
