import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] alp = new int[26];
		int max=0, max_num=0, cnt=0;
		
		for(int i=0; i<str.length(); i++) { // 아스키코드 65~90 대문자, 97~122//소문자;
			if((byte)str.charAt(i)>=65 && (byte)str.charAt(i)<=90)
			{
				alp[(byte)str.charAt(i)%65]++;
			}
			else if((byte)str.charAt(i)>=97 && (byte)str.charAt(i)<=122) {
				alp[(byte)str.charAt(i)%97]++;
			}
		}
		
		for(int i=0; i<26; i++) {
			if(alp[i]>max) {
				max=alp[i]; max_num=i;
			}
		}
		
		for(int i=0; i<26; i++) {
			if(alp[i]==max)
			{
				cnt++;
			}
		}
		
		if(cnt>=2)
			System.out.println("?");
		else
			System.out.printf("%c",max_num+65);
	}
}
