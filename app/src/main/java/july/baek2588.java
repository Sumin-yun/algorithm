package july;
import java.util.Scanner;

/* 2021.07.07,
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */

public class baek2588 {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();

    int st1= a*(b%10);
    int st2= a*((b%100)-(b%10));
    int st3= a*(b-(b%100));
    System.out.println(st1);
    System.out.println(st2/10);
    System.out.println(st3/100);
    System.out.println(st1+st2+st3);

  }  
}
