/*
영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다.
이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int cnt=1, space_start=0, space_end=0;

		if(str.charAt(0) == ' ') space_start=1;
		
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
				cnt++;
		}
		
		System.out.println(cnt-space_start);
		
	}		
}
