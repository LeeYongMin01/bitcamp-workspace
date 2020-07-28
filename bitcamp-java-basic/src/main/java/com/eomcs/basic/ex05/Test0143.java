package com.eomcs.basic.ex05;


//# 산술 연산자 : 연산의 결과 타입

public class Test0143 {
  public static void main(String[] args) {
    
    float f1 = 987.6543f;
    float f2 = 1.111111f;
    System.out.println(f1);
    System.out.println(f2);
    
    float r1 = f1 + f2;
    // f1과 f2에 들어 있는 값이 유효자릿수라 하더라도
    // 연산 결과가 유효자릿수가 아니라면 값이 깨짐
    // float + float = float 이기 때문
    
    System.out.println(r1);
    // 기대값: 987.6543 + 1.111111 = 988.765411 이지만
    // 결과값: 988.7654
    // 결과가 옳지 않게 나온 이유?
    // => float과 float의 연산 결과는 float이다. 7자리까지만 지원함
    // => 그래서 메모리 크기를 넘어가는 뒤의 11은 짤린다.
    
    //그럼 결과를 담을 변수의 크기를 늘리면 되는가?
    double r2 = f1 + f2;
    System.out.println(r2);
    // 기대값: 988.765411
    // 결과값: 988.765380859375
    // 기대한 결과가 나오지 않은 이유?
    // => float과 float의 연산 결과는 float이다.
    // => double 변수에 저장하기 전에 이미 float 값이 되면서 일부 값이 왜곡되었다.
    
    
    // 그런데 r1 변수와 달리 뒤에 이상한 숫자가 많이 붙는 이유는 무엇인가?
    // => IEEE 754의 이진수 변환 문제때문이다.
    // => 4바이트 float 부동소수점을 8바이트 double 부동소수점 변수에 저장할 때 
    //    왜곡된 값이 들어 갈 수 있다.
    // => float를 double 변수에 넣을 때 왜곡이 발생하기 때문에 
    //    가능한 double 변수로 값을 바꾼 다음에 연산을 수행하라.
    //    더 좋은 것은 처음부터 double 변수를 사용하라!

    
    // 다음과 같이 처음부터 double 변수를 사용하라!
    double d1 = 987.6543;
    double d2 = 1.111111;
    double r5 = d1 + d2; // = 988.765411
    System.out.println(r5);
    // 그럼에도 실제 출력해보면 맨 뒤에 극한의 작은 수가 붙는다.
    // 이유? IEEE 754 이진수 변환 문제이다. 고민하지 말라!
    // 어떻게 처리할 건데? 맨 뒤에 붙은 극한의 작은 수는 그냥 잘라 버린다.
    
    
    
    
    
    
  }
}
