#include<stdio.h>
#include<conio.h>
void main(){
int a,b,c;
printf("\n enter the numbers :");
scanf("%d",&a);
scanf("%d",&b);
scanf("%d",&c);
if((b<c)&&(a<c)){
    printf("c is greater than b and a");
}
if((b>a)&&(b>c))
{
    printf("b is b greater  than a and c");
}
if((b<a)&&(c<a))
   {
    printf("a is greater than b and c");
}
}
