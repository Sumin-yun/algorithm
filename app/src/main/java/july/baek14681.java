package july;
import java.util.Scanner;

public class baek14681 {
  /* 2021.07.08
  점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
  단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
  첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 
  다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)   * 
   */
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    int y = scan.nextInt();

    if(x>=-1000 && x<=1000 && x!=0) {
      if(y>=-1000 && y<=1000 && y!=0) {
        if(x>0 && y>0) {
          System.out.println("1");
        }
        else if(x<0 && y>0) {
          System.out.println("2");
        }
        else if(x>0 && y<0) {
          System.out.println("4");
        }
        else {
          System.out.println("3");
        }
      }
    }
  }  
}
