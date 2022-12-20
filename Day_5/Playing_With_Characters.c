#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char c, ch[20],cham[50];
    scanf("%c",&c);
    scanf("%s",ch);
    scanf("\n");
    scanf("%[^\n]s",&cham);

printf("%c\n",c);
printf("%s\n",ch);
printf("%s",cham);

return 0;
}
