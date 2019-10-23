import java.io.*;
import java.util.*;
class Program1
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Gimme a number");
		int i=sc.nextInt();
		if(i%2==0)
		{System.out.println("Even number");
		}
		else
		{System.out.println("Odd number");
		}
		
	}
}
