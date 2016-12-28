#include<stdio.h>
#include<conio.h>
void main(){
char i;
int islowercasevowel,isuppercasevowel;
printf("\n enter the character");
scanf("%c",&i);
islowercasevowel=(i=='a'||i=='e'||i=='i'||i=='o'||i=='u');
isuppercasevowel=(i=='A'||i=='E'||i=='I'||i=='O'||i=='U');
if(islowercasevowel||isuppercasevowel){

    printf("\n the character is vowels");

}
else if(isdigit(i)){
    printf("\n the character is number");

}
else
{

    printf("undefined");
}
}
