//B7.c
#include <conio.h>
#include <stdio.h>
#define pa printf("----------------------------------\n");

int main(){
	
	char loaner_name[50];
	double loan_money_amount;
	
	pa
	printf("     Program  Benefit of Loan\n");
	pa
	printf("Enter name of loan : ");
	scanf("%s", &loaner_name);
	printf("Enter money of loan : ");
	scanf("%lf", &loan_money_amount);
	pa
	if(loan_money_amount >= 1000){
		double loan_benefit = loan_money_amount * 2.5 / 100 ;
		printf("Benefit of loan is : %lf\n", loan_benefit);
	}else{
		double loan_benefit = loan_money_amount * 5.5 / 100 ;
		printf("Benefit of loan is : %lf\n", loan_benefit);
	}
	pa
	
	getch();
}