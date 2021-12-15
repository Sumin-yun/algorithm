package December;

import java.util.Scanner;

public class Exam3 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int b = scan.nextInt();
    System.out.println(solution(b));
  }

  public static int solution(int b) {
    int answer = 0;
    int p=1;
    int c=1;
    for(int a=1; a<=b; a++) {
      int temp = (a*a)+(b*b);       //17=1+16   
      // System.out.println(temp); 
      for(c=1; c<=500000; c++) {    //1
        p = c*c;  
        if(p == temp){
          return c;
        }
      } 
    } if(answer==0) {
      answer=-1;
    }
    return answer;  
  }
}


