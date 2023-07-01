//hw_11
#include <conio.h>
#include <stdio.h>
#define pa printf("-----------------------\n");

int main(){
	
	char home_num[20];
	double water_unit;
	
	pa
	printf("  Program  Pay  Water\n");
	pa
	printf("Enter home number : ");
	scanf("%s", &home_num);
	printf("Enter unit of water use : ");
	scanf("%lf", &water_unit);
	pa
	if( 20 >= water_unit ){
		double water_price = water_unit * 5.00;
		printf("Pay for water use is : %.2lf", water_price);
	}else if( 20 < water_unit, water_unit < 50 ){
		double water_price = water_unit * 3.50;
		printf("Pay for water use is : %.2lf", water_price);
	}else if( 50 <= water_unit ){
		double water_price = water_unit * 3.00;
		printf("Pay for water use is : %.2lf", water_price);
	}
	printf("\n");
	pa
	
	getch();
}