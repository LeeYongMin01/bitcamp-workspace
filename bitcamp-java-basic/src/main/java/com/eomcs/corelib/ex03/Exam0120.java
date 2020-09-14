// java.util.ArrayList와 비교
package com.eomcs.corelib.ex03;

import java.util.ArrayList;

public class Exam0120 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList(); //ArrayList는 인스턴스의 주소를 관리하는 것
    list.add("aaa"); // aaa,
    list.add("bbb"); // aaa, bbb,
    list.add("ccc"); // aaa, bbb, ccc,
    list.add("ddd"); // aaa, bbb, ccc, ddd,

    print(list);
    list.remove(2); // aaa, bbb, ddd, // ccc값은 주소를 잃어버려 가비지값이 되었음
    print(list);

    list.remove(0); // bbb, ddd, // aaa값은 주소를 잃어버려 가비지값이 되었음
    print(list);

    // 유효한 인덱스가 아니면 예외 발생시킨다!
    //list.remove(4); // 실행 오류!
//    print(list);

    list.add(1, "xxx"); // bbb, xxx, ddd,
    list.add(1, "yyy"); // bbb, yyy, xxx, ddd // xxx가 뒤로 밀림
    list.add(0, "zzz"); // zzz, bbb, yyy, xxx, ddd // bbb가 뒤로 밀림
    print(list);

    // 삽입할 인덱스가 배열의 크기를 가리킬 경우, 맨 끝에 추가한다.
    list.add(5, "ttt"); // zzz, bbb, yyy, xxx, ddd, ttt
    print(list);

    list.set(1, "aaa"); // zzz, aaa, yyy, xxx, ddd, ttt // bbb를 aaa로 교체함
    print(list);

    list.add("ccc"); // zzz, aaa, yyy, xxx, ddd, ttt, ccc
    //add에 인덱스를 지정해주지 않으면 배열의 끝에 값이 할당됨
    print(list);

    list.add("eee"); // zzz, aaa, yyy, xxx, ddd, ttt, ccc, eee
    print(list);

  }
  static void print(ArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ", ");
    }
    System.out.println();
  }
}

