#include <stdio.h>
#include <stdlib.h>

// function prototype
void f1(int); // 실제 함수는 아래에 있고, 함수에 대한 선언만 해주는 것
void f2(int*);

int main(){
  int a = 200;

  f1(a);
  
  printf("a = %d\n", a);
  
  f2(&a);
  
  printf("a = %d\n", a);
    
  return 0;
}

void f1(int a) {
  a = 100;

}

void f2(int* p) {
  *p = 100;
}