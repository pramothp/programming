#include<stdio.h>
#include<conio.h>
void main(){
int i,n,sum=0;
printf("\n enter the number");
scanf("%d",&n);
for(i=1;i<n;i++)
    {

        sum+=i;
    }
    printf("\n %d",sum);
}
