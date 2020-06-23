/*
자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로,
이들 소수의 합은 620이고, 최솟값은 61이 된다.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int temp, sum=0, min=0;
	
		for(int i=a; i<=b; i++)
		{
			temp=0;
			if(i!=1) // a~b 사이 수가 1이 아니면 소수 판별 실행
			{
				for(int j=2; j<i; j++) // 소수 판별
				{
					if(i%j==0) // 약수가 있으면 temp++
						temp++;
				}
				if(temp==0) // 약수가 없었으면
				{
					if(min==0) { // 최소값 체크
						min=i; // 아직 없으면 i가 최소값
					}
					sum += i; // 더해주기
				}
			}
		}
		
		if(sum==0)
			System.out.println(-1);
		else{
			System.out.println(sum);
			System.out.println(min);
		}
	}	
}
