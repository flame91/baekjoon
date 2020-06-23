import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int[] cal = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] date = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int cnt=0;
		
		for(int i=0; i<month-1; i++)
		{
			cnt += cal[i];
		}
		
		cnt += day;
		
		System.out.println(date[cnt%7]);
		
    }
}
