#include <stdio.h>
int main()
{
  int c = 0, count = 0;
  char str[100];
  printf("Input a string\n");
  gets(str);

  while (str[c] != '\0') {
    if (str[c] == 'a' || str[c] == 'A' || str[c] == 'e' || str[c] == 'E' || str[c] == 'i' || str[c] == 'I' || str[c] =='o' || str[c]=='O' || str[c] == 'u' || str[c] == 'U')
      count++;
    c++;
  }
  printf("Number of vowels in the string: %d", count);
  return 0;
}
