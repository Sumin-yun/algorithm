package December;

import java.util.Scanner;

public class Exam01 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int input = scan.nextInt();
    System.out.println(Cal(input));

  }


  public static int Cal(int x) {
    while(x>=1 && x<=12) {
      int month=(x/4)+1;
      return month;
    }
    return x;
  }
}
