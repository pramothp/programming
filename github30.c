#include<stdio.h>
int main(){
int rem,a,b,s,k,c;
printf("\nEnter the value of a and b");
scanf("%d %d",&a,&b);
while(a<=b)
{
c=a;
k=0;
while(c>0)
{
rem=c%10;
c=c/10;
s=rem*rem*rem;
k=s+k;
}
if(k==a)
{
printf("\nthe armstriong number is :%d",k);
}
a++;
}
}
