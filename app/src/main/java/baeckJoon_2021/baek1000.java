package baeckJoon;
import java.util.Scanner;

/* 2021.07.07.화
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

 */

public class baek1000 {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    if (0 < a && b< 10) {
      int sum=a+b;
      System.out.println(sum); 
    }
  }}