package baeckJoon;
import java.util.Scanner;

/* 2021.07.07.화
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 * (1 ≤ A, B ≤ 10,000)
 */
public class baek10869 {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();

    if(1<=a && b<=10000) {
      System.out.printf("%d \n", a+b);
      System.out.printf("%d \n", a-b);
      System.out.printf("%d \n", a*b);
      System.out.printf("%d \n", a/b);
      System.out.printf("%d \n", a%b);
    }
  }
}
