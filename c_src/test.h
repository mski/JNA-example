#include <stdbool.h>

typedef struct {
} Test;

int add(int left, int right);
Test * create_Test(int amount);
Test * multiply(const Test *dollar, int multiplier);
bool equal( const Test *dollar, const void *other);
