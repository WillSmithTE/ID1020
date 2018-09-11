#include<stdio.h>

void reverse(void)
{
    char c;
    if((c = getchar()) != '\n'){ reverse(); }
    putchar(c);
    return;
}

int main(void)
{
    printf("Enter a line of text below:n");
    reverse();
    putchar('\n');
}
