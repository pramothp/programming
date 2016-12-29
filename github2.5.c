#include<stdio.h>
#include<conio.h>
void main(){
int m,n;
printf("\n enter the number");
scanf("%d",&m);
scanf("%d",&n);
while(m<n)
    {

        if(m%2==0)
            printf("\n%d",m);
        m++;
    }
}
