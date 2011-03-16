#include <stdlib.h>
#include "test.h"

typedef struct {
  int amount;
} TestPrivate;

int add(int left, int right){
  return left+right;
}

Test *
create_Test(int amount){
  TestPrivate *test = malloc( sizeof(TestPrivate));
  test->amount = amount;
  return (Test *) test;
}

Test *
multiply( const Test *dollar, int multiplier ) {
  return create_Test( ( ( TestPrivate * ) dollar )->amount * multiplier );
}

bool
equal( const Test *dollar, const void *other ) {
  return ( ( TestPrivate * ) dollar )->amount == ( ( TestPrivate * ) other )->amount;
}


int main(){
  Test *test = create_Test(5);
}
