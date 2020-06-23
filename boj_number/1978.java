import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[1000];
		int temp=0, cnt=0;
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			temp=0;
			if(arr[i]!=1) // 입력받은 수가 1이 아니면 소수 판별 실행
			{
				for(int j=2; j<arr[i]; j++) // 소수 판별
				{
					if(arr[i]%j==0) // 약수가 있으면 temp++
						temp++;
				}
				if(temp==0) // 약수가 없었으면
					cnt++; // 소수 갯수 cnt++
			}
		}
		
		System.out.println(cnt);
	}		
}
