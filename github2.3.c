#include<stdio.h>
#include<conio.h>
void main(){
int n,i,count=0,r;
printf("\n enter the number");
scanf("%d",&n);
for(i=2;i<=n;i++)
    {

       if(n%i==0){
        count++;
       }

    }
    if(count==1)
    {

        printf("\n the given number is  prime");

    }
    else
    {

        printf("\n the given number is not  a prime");

    }
}

