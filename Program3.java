import java.io.*;
import java.util.*;
class Program3
{
public static void main(String args[])throws IOException
{

Scanner sc = new Scanner(System.in);
			int principal = sc.nextInt();
			float rate = sc.nextFloat();
			int time = sc.nextInt();
			float SimpleInterest = principal*rate*time/100;
			System.out.println("interest = "+ SimpleInterest);

}
}
