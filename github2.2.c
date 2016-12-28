#include<stdio.h>
#include<conio.h>
void main(){
int n,remainder,r=0,originalinteger;
printf("\n enter the number ");
scanf("%d",&n);
n=originalinteger;
while(n!=0)
    {

        remainder=n%10;
        r=r*10+remainder;
        n=n/10;
    }

    if(r==originalinteger)
    {
        printf("\n the entered  number is palindrome");

    }
    else
    {

        printf("\n the entered number is not a palindrome");

    }

}
