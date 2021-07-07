package july;
import java.util.Scanner;

/*2021.07.07.화
 * 정수 a,b를 입력받아 a는 가로 *의 갯수,b는 세로 *의 개수가 되도록
 * 직사각형을 만들어라
 */


public class programmers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    for(int i=1; i<=b; i++){
      System.out.print("\n");
      for(int j=1; j<=a; j++){
        System.out.print("*");
      }
    }
  }}


