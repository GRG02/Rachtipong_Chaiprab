//hw_9
#include <conio.h>
#include <stdio.h>
#define pa printf("---------------------------\n");

int main(){
	
	char home_num[15];
	double electric_unit;
	
	pa
	printf("   Program  Pay Electric\n");
	pa
	printf("Enter home number : ");
	scanf("%s", &home_num);
	printf("Enter unit of electric : ");
	scanf("%lf", &electric_unit);
	pa
	if( electric_unit <= 20 ){
		double electric_price = electric_unit * 5.00;
		printf("Pay for electric use is : %.2lf", electric_price);
	}else if( 21 < electric_unit, electric_unit <= 49 ){
		double electric_price = electric_unit * 4.50;
		printf("Pay for electric use is : %.2lf", electric_price);
	}else if( electric_unit >= 50 ){
		double electric_price = electric_unit * 4;
		printf("Pay for electric use is : %.2lf", electric_price);
	}
	printf("\n");
	pa
	
	getch();	
}