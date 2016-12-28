#include<stdio.h>
#include<conio.h>
void main(){
int count=0,n;
printf("\n enter the number :");
scanf("%d",&n);
do{
    n=n/10;
    count++;
}while(n!=0);
printf("\n %d",count);
}

