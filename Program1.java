import java.io.*;
import java.util.*;
class Program1
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey! buddy enter a number =");
		int a=sc.nextInt();
		if(a%2==0)
		{ System.out.println("even number");
		}
		else
		{ System.out.println("odd number");
		}
	}
}
