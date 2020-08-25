import java.util.Scanner;

public class Mul
{
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter number:");
		int N=scanner.nextInt();
		for(int i=1; i <= 10; i++)
		{
			System.out.println(N+" x "+i+" = "+N*i);
        }
    }
}