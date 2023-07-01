//hw_12
#include <conio.h>
#include <stdio.h>
#define pa printf("-----------------------\n");

int main(){

    int year;  
    
    pa
    printf("Program Check Leap Year\n");
    pa
    printf("Enter year : ");
    scanf("%d", &year);
    pa
    if((year%4==0) && ((year%400==0) || (year%100!=0))){
        printf("Year is leap year");  
    }else{  
        printf("Year is not leap year");  
    } 
	printf("\n"); 
    pa
    
    getch();  
}  