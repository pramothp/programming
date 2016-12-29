#include<stdio.h>
#include<conio.h>
void main(){
int i,m,n,count;
printf("\n enter the number");
scanf("%d",&m);
scanf("%d",&n);
while(m<n){
    count=0;
    for(i=2;i<=m/2;++i)
{

    if(m%i==0)
    {
    count=1;
    break;
}}
if(count==0)
printf("%d",m);
++m;}
}

