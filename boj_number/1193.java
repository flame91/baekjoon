import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0, temp=0, x=0, y=0;
		
		while(true)	{
			if(temp<n)
				temp += ++cnt; // temp 1, cnt 1
			else break;
			
		}
		

		if(cnt%2==0){
			x=n-(temp-cnt);
			y=cnt+1-x;
		}
		else{
			y=n-(temp-cnt);
			x=cnt+1-y;
		}		
			
		System.out.println(x+"/"+y);
		
	}
}
