/*
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
*/

import java.util.*;
 
public class Main {
    public static void main(String[] args){
        
     // 두 정수 입력
         Scanner scan = new Scanner(System.in);
         double num1 = scan.nextInt();
         double num2 = scan.nextInt();
         
         System.out.println(num1/num2); // num1을 num2로 나눈 값 출력
        
    }
}
