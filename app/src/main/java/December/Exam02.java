package December;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {
  public static void main(String[] args){

    int count=0;

    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> list =  new ArrayList<>();

    System.out.println("수를 입력해주세요.(입력완료:음수입력)");
    while(true) {  

      int x = scan.nextInt();
      ++count;
      list.add(x);

      if(x <= -1) {
        for(int i:list) {
          System.out.print(i);
        }
        System.out.println("====");
        System.out.println(Cal(list,count));
        break;
      }
    }
  } 

  private static int Cal(ArrayList<Integer> list,int count) {
    int[] num = new int[count];
    int min = 0;

    for(int k:list) {
      for(int i=0; i<count; i++) {
        if(i!=k) { 
          num[i]=i;
          if(num[i-1]>num[i] || num[0]>num[i]) {
            min=num[i];
          }
        }
      }
    }
    return min;
  }
}