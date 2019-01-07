package frstsecond;
import java.util.*;
public class Fact {

	public static void main(String[] args) {
		int i, fact=1,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
      System.out.println(fact);
	}

}
