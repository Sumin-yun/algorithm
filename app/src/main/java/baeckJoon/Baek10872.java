package baeckJoon;

import java.util.Scanner;

/*2022.01.11.
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.*/

public class Baek10872 {

  public static void main(String args[]) {

    int a=1;

    Scanner scan = new Scanner(System.in);
    a = scan.nextInt();

    System.out.println(factorial(a));
  }

  public static int factorial(int a) {
    if(a == 1 || a == 0) {
      return 1;
    } else {
      return a*factorial(a-1);
    }
  }
}