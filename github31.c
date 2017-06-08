#include<stdio.h>
int main()
{

    int first=0,second=1;
    int third,n,m=0;
    printf("enter the number");
    scanf("%d",&n);
    while(m<=n){
    printf("%d",first);
    third=first+second;
    first=second;
    second=third;
    m++;
    }
}
