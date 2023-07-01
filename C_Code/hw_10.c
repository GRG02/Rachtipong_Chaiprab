//hw_10
#include <conio.h>
#include <stdio.h>
#define pa printf("++++++++++++++++++++++++\n");

int main(){
	
	char telephone_name[50], telephone_num[10];
	double used_minute;
	
	pa
	printf("   Program  Telephone\n");
	pa
	printf("Enter name of telephone : ");
	scanf("%s", &telephone_name);
	printf("Enter number of telephone : ");
	scanf("%s", &telephone_num);
	printf("Enter minute for use telephone : ");
	scanf("%lf", &used_minute);
	pa
	if( 1 <= used_minute, used_minute <= 15 ){
		double pay_for_use = used_minute * 5;
		printf("Pay for use telephone is : %.2lf", pay_for_use);
	}else if( 16 <= used_minute, used_minute <= 30 ){
		double pay_for_use = used_minute * 3;
		printf("Pay for use telephone is : %.2lf", pay_for_use);
	}else if( used_minute >= 31 ){
		double pay_for_use = used_minute * 1.50;
		printf("Pay for use telephone is : %.2lf", pay_for_use);
	}
	printf("\n");
	pa
	
	getch();
}