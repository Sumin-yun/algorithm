package Agust;

public class Student {

  static int serialNum = 100; // static 변수

  int studentID;

  public Student() {
    serialNum++; //공유되면서 중가 
    studentID = serialNum; // 각각 가지는 값
  }

}



