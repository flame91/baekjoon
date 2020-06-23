/*
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int  group=n, flag;
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			flag = 0;
			
			for(int j=0; j<str.length()-1; j++) { // aba j=0 / 1

				for(int k=j+1; k<str.length(); k++) // k=1,2 / 2
				{

					if(str.charAt(j)==str.charAt(k)) {
						for(int l=j; l<=k-1; l++) { // 두 문자 사이 다른 문자 있나 검사
							if(str.charAt(j)!=str.charAt(l)) {
								group--; flag=1; break; // 다른 문자 있으면 group 감소
							}
						}
					}
					if(flag==1) break;
				}
				if(flag==1) break;
			}
		}
		
		System.out.println(group);
	}
}
