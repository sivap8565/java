package frstsecond;
import java.util.*;
public class Amstrong {
	public void amstrong()
	{
	 int r,n,sum=0,m;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter n");
	 n=s.nextInt();
	 m=n; 
	 while(n!=0)
	 {
		 r=n%10;
		 sum=sum+r*r*r;
		 n=n/10;
	 }
	 if(sum==m)
	 {
		 System.out.println(sum);
	 }
	 else
	 {
		 System.out.println("error");
	 }
	 
	}

	public static void main(String[] args) {
		Amstrong a=new Amstrong();
		a.amstrong();

	}

}
