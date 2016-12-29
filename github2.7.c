#include<stdio.h>
#include<conio.h>
void main(){
int digit,a,rem,temp=0;
printf("\n enter the number ");
scanf("%d",&a);
digit=a;
while(digit>0){
    rem=digit%10;
    temp=temp+rem*rem*rem;
    digit=digit/10;
   }
   printf("\n%d",temp);
      if(a==temp)
         printf("\n the number is armstrong number ");
    else
        printf("\n the number is not armstrong");

}

