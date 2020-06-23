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
