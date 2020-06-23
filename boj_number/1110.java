import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt(); // n= 26, 2+6=8 68, 6+8=14 84,
		int one,ten,cnt=0;
		
		int n2=n;
		
		do
		{
			ten = n2/10; // ten=2,6
			one = n2%10; // one=6,8
			
			n2=(one*10)+(ten+one)%10;// n2=6*10+2+6=68,8*10+6+8

			cnt++;
		}while(n!=n2);
		
		System.out.println(cnt);
    }
}
