package December;

import java.util.Scanner;

//1.분기 숫자 구하기

public class Exam01 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int month = scan.nextInt();

    if(Cal(month)==-1) {        //리턴값에 따른 출력문 정의
      System.out.println("1-12사이 수만 입력해주세요.");
    } else {
      System.out.println(Cal(month));      
    }
  }


  private static int Cal(int month) {
    if(month>=1 && month<=12) {  //1-12사이의 수를 입력했을시 x 리턴
      int x;
      if(month%3!=0) {
        x=(month/3)+1;
        return x;
      } else {
        x=(month/3);
        return x;
      }
    } else {        //1-12사이 수를 입력하지 않았을시 무효한 값(-1) 리턴
      return -1;
    }
  }
}
