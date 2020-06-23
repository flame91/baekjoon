import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double avg=0;
		int max=0, sum=0, score;
		
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			score = sc.nextInt(); // a[i] 입력
			
			if(score>max) // 새로 입력받은 값이 max보다 크면 갱신
				max=score;
			
			sum += score; // 합계
		}

		avg = 100.0*sum/n/max;

		System.out.printf("%.2f",avg);
		
    }
}
