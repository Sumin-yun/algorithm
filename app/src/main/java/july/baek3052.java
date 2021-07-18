package july;
import java.util.Scanner;

public class baek3052 {

  /* 2021.07.14
  두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
  예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
  수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
  그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
   */

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] num= new int[10];  
    int count = 0;
    boolean b1;

    for(int i=0; i<10; i++) {
      num[i]=scan.nextInt()%42;
    }
    scan.close();

    for(int i=0; i<10; i++) {
      b1=false;
      for(int j=i+1; j<10; j++) 
        if ((num[i]) == (num[j])) {        
          b1 = true;    
          break;
        } 
      if(b1==false) {
        count++;
      }
    }
    System.out.print(count);
  }
}

