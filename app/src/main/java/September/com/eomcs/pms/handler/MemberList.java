package September.com.eomcs.pms.handler;

import September.com.eomcs.pms.domain.Member;

public class MemberList {

  static final int MAX_LENGTH = 5;
  Member[] members = new Member[MAX_LENGTH];
  int size = 0;


  public void add(Member member) {
    this.members[size++] = member;
  }

  public Member[] toArray() {
    Member[] arr = new Member[this.size];
    for(int i = 0; i<size; i++) {
      arr[i] = members[i];
    }
    return arr;
  }

  boolean exist(String name) {
    for (int i = 0; i < this.size; i++) {
      if (this.members[i].name.equals(name)) {
        return true;
      }
    }
    return false;
  }

  public Member findByNo(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.members[i].no == no) {
        return this.members[i];
      }
    }
    return null;
  }

  public int indexOf(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.members[i].no == no) {
        return i;
      }
    }
    return -1;
  }

  public boolean remove (Member member) {
    int index = indexOf(member);
    if(index == -1) {

    }
  }

}
