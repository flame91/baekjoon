/*
오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int[] cal = {31,28,31,30,31,30,31,31,30,31,30,31}; // 월별 일수
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
