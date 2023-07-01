//B2.c
#include <conio.h>
#include <stdio.h>
#define pa printf("=================================\n");

//int total(){
//	printf("%d", num1 + num2 + num3 + num4 + num5);
//}

int main(){
	int num1, num2, num3, num4, num5;
	pa
	printf("   Program  Average  5  Number\n");
	pa
	printf("Enter number 1 : ");
	scanf("%d", &num1);
	printf("Enter number 2 : ");
	scanf("%d", &num2);
	printf("Enter number 3 : ");
	scanf("%d", &num3);
	printf("Enter number 4 : ");
	scanf("%d", &num4);
	printf("Enter number 5 : ");
	scanf("%d", &num5);
	pa
	int total = num1 + num2 + num3 + num4 + num5;
	printf("Sum of 5 number is : %d\n",total);
	printf("Average of 5 number is : %d\n",total/5);
	pa
	
	getch();
}