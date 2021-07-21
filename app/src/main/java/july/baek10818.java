package july;
import java.util.Scanner;

public class baek10818 {

  /* 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
   * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
     모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
   */

  // 백준에서 컴파일하면 시간초과 에러 .
  // 해결책 -> 단일 루프로 작성해야 한다.

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int LENGTH = 0;
    int i = 0;
    int size = 0;
    int num[] ;


    while(true) {
      size= scan.nextInt();
      if(size < 1 || size > 1000000){
        continue;
      } else {
        num= new int[size];
        break;
      }
    }


    while(i < size) {
      int inputNum = scan.nextInt();
      if(-1000000 > inputNum || inputNum > 1000000) {
      } else {
        num[i++] = inputNum;   
      }
    }


    for(int k=0; k<size; k++) {
      for(int j=k+1; j<size; j++){
        if(num[k] > num[j]) {
          int temp = num[k];
          num[k] = num[j];
          num[j] = temp;     
        }
      }
    }

    System.out.println(num[0]);
    System.out.println(num[size-1]);  
  }
}
