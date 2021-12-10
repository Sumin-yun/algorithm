package December;

import java.util.Scanner;

public class Exam01 {
  public static void main(String[] args){

    int month;
    int x;

    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();

    while(input>=1 && input<=12) {
      month=(input/4)+1;
    }

    scan.close();

  }
}


