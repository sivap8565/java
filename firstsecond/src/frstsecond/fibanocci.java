package frstsecond;
import java.util.*;
public class fibanocci {

	public static void main(String[] args) {
		int a=0,b=0,c=1,i,n;
		Scanner j=new Scanner(System.in);
		System.out.println("enter n");
		n=j.nextInt();
		for(i=1;i<n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
		

	}

}
