package frstsecond;
import java.util.*;
public class Reverse {
	public void reverse()
	{
		int i;
		String str,reverse="";
		Scanner s=new Scanner(System.in);
		System.out.println("enter str");
		str=s.nextLine();
		for(i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+ str.charAt(i);
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
      Reverse r=new Reverse();
      r.reverse();

	}

}
