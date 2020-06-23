/*
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();			
		
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=n; j++)
			{
				if(j>n-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
    }
}
