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
