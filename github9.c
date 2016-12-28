#include<stdio.h>
#include<conio.h>
void main(){
int n,i,sum=0;
printf("\n enter the number");
scanf("%d",&n);
for(i=0;i<n;i++)
    {

        sum+=i;
    }
    printf("\n %d",sum);
}
