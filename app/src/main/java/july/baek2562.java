package july;
import java.util.Scanner;

public class baek2562 {
  public static void main(String[] args) {
    /* 
     * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61
이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
     */

    Scanner scan = new Scanner(System.in);

    int LENGTH = 10;
    int arr[] = new int[LENGTH];
    int newArr[] = new int [LENGTH];
    int temp = 0;
    int a = 0;

    for(int i=0; i<9; i++) {
      int num = scan.nextInt();
      if(num >= 100) {
        return;
      }
      arr[i] = num;
      newArr[i] = arr[i];
    }

    for(int i=0; i<9; i++) {
      if(arr[i] > arr[i+1]) {
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
      }
    }

    for(int i=0; i<9; i++) {
      if(arr[9] == newArr[i]) {
        a = i;
      }
    }
    System.out.println(arr[9]);
    System.out.println(a+1);

  }
}
