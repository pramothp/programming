#include<stdio.h>
#include<conio.h>
void main(){
int i,n,m;
printf("\n enter the number");
scanf("%d",&n);
for(i=1;i<=16;i++){
    m=n*i;
    printf("\n%d*%d=%d",i,n,m);
}
}
