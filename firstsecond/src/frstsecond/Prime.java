package frstsecond;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		int i,j,flag=0,s1,s2;
		Scanner n=new Scanner(System.in);
		System.out.println("enter s1");
		s1=n.nextInt();
		System.out.println("enter s2");
		s2=n.nextInt();
		System.out.println("print prime numbers");
		for (i=s1;i<=s2;i++)
		{
			for (j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
				
		}

	}

}
