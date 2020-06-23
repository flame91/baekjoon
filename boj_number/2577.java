import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int product = a*b*c;
		
		int[] arr = new int[10];
		
		while(true)
		{
			if(product==0)
				break;
			else
			{
				arr[product%10]++;
				product /= 10;
			}
		}
		
		for(int i=0; i<=9; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
		
}
