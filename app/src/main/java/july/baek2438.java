package july;
import java.util.Scanner;

public class baek2438 {
  /* 20201.7.10
   * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
   * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
   */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    String str = "*";

    if(n>=1 && n<=100) {
      for(int i=0; i<n; i++) {
        for(int j=0; j<=i; j++) {
          System.out.print("*");  
        }        
        System.out.println();
      }       
    }
  }}
