package july;

import java.util.Scanner;

/*
 * 2021.07.08 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성. -10,000 ≤ A, B ≤ 10,000
 */
public class baek1330 {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();


    if (-10000 <= a && a <= 10000 && -10000 <= b && b <= 10000) {
      if (a > b) {
        System.out.println(">");

      } else if (a < b) {
        System.out.println("<");
      } else {
        System.out.println("==");
      }
    } else {
      System.out.println("해당 범위의 값이 아닙니다.");

    }
  }
}


