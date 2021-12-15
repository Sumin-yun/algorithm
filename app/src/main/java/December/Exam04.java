package December;

import java.util.Scanner;

//    학생의 시험 점수를 바탕으로 등수를 부여하려고 합니다. 각 학생의 등수는 자신보다 높은 점수를 받은 학생의 수에 1을 더한 수입니다. 
//    예를 들어, 세 학생이 있고 1, 2, 3번 학생의 성적이 각각 2, 2, 1이라면 1, 2번 학생은 가장 점수가 높고 동점이기 때문에 1등이고, 3번 학생은 1, 2번 학생보다 점수가 낮기 때문에 3등입니다.
//    1번부터 N번 학생까지의 점수가 순서대로 들어있는 배열 grade가 주어질 때 1번부터 N번 학생까지의 등수가 순서대로 들어있는 배열을 return 하도록 solution 함수를 완성해주세요.
//    grade의 길이는 1 이상 1,000,000 이하입니다.
//    grade의 각 원소는 1이상 1,000,000,000 이하입니다.

public class Exam04 {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    int size= scan.nextInt();
    int grade[] = new int[size];

    for(int i=0; i<size; i++) {
      grade[i] = scan.nextInt();
    }

    //    for(int i=0; i<grade.length; i++) {
    //      System.out.print(grade[i]);
    //    }

    //    for(int i=0; i<solution(grade, size).length; i++) {
    //      System.out.println(solution(grade, size)[i]);
    //    }

    System.out.println(1111);
    solution(grade, size);
  }

  private static int[] solution(int[] grade, int size) {
    int[] answer = new int[size];

    for(int i=0; i<size; i++){
      int count =1;
      System.out.println(2222);
      for(int j=0; j<size; j++) {
        if(grade[i]<grade[j]) {
          count++;  
        }
      }
      answer[i] = count;
      System.out.println(answer[i]);
    }
    return answer;
  }
}

