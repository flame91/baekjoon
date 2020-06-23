/*
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch;
		String[] str = new String[1000];
		String temp;
		
		for(int i=0; i<n; i++)
		{
			ch = sc.nextInt(); // 5
			temp = sc.next(); // nextLine()은 개행문자도 빈 칸으로 입력받는다
			
			str[i]="";
			for(int j=0; j<temp.length(); j++) // 0,1,2,3
			{
				for(int k=0; k<ch; k++) // 0,1,2,3,4
				{
						str[i] = str[i] + temp.charAt(j); // temp에 있는거 한 글자씩 떼어서 ch번만큼  str[i]에 이어붙이기
				}
			}
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println(str[i]);
		}
		
	}
}
