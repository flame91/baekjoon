import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0, sum=1;
		
		while(true)
		{
			if(n==1)
			{
				cnt++;
				break;
			}
			else if(n<=sum)
				break;
			else
			{
				cnt++;
				sum += cnt*6-6;
			}
		};
		
		System.out.println(cnt);
	}
}
