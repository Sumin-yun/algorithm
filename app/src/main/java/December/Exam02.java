package December;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> list =  new ArrayList<>();

    System.out.println("수를 입력해주세요.(입력완료:음수입력)");
    while(true) {  

      int x = scan.nextInt();
      list.add(x);

      if(x <= -1) {
        for(int i:list) {
          System.out.print(i);
        }
        System.out.println("====");
        System.out.println(Cal(list));
        break;
      }
    }
  }

  private static int Cal(ArrayList<Integer> list) {
    int temp[]=null;
    int min = 0;
    for(int k:list) {
      for(int i=0; i<list.size(); i++) {
        if(i!=k) { 
          temp[i]=i;
          if(temp[i+1]>temp[i]) {
            min=temp[i];
          }
        }
      }
    }
    return min;
  }
}