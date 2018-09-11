#include <stdio.h>

void dostuff() {
    int c;
    if ((c = getchar()) != '\n') {
      dostuff();
    }
    putchar(c);
}

int main() {
  dostuff();
  printf("\n");
  return 0;
}


