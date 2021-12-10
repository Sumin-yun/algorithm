package September;

import java.util.Scanner;

class Solution {
  public static void main(String[] args){
    int answer = 0;

    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();

    if(num1 >= 1 &&  num1 < 8000000){

      while(true){
        if(num1 != 1){
          if(num1 % 2 == 1){
            num1 = (num1 * 3) + 1;
            answer++;
          } else {
            num1 = num1/2;
            answer++;
            if(answer==499){
              return -1 ;
            }     
          }        
        }
        return answer;
      }   
    }
    return answer;
  }
}




