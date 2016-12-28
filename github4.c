#include<stdio.h>
#include<conio.h>
void main(){
char a;
printf("\n enter the character:");
scanf("%c",&a);
if(isalpha(a)){
    printf("\n character is alphabet");
}
else
    printf("\n character is not alphabet ");

}
