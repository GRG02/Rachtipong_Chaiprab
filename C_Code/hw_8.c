//hw_8
#include <conio.h>
#include <stdio.h>
#define pa printf("++++++++++++++++++++++++++++\n");

int main(){
	
	char name[50];
	char car_num[15];
	double rent_hour;
	
	pa
	printf("     Program  Rent Taxi\n");
	pa
	printf("Enter name for rent : ");
	scanf("%s", &name);
	printf("Enter car number for rent : ");
	scanf("%s", &car_num);
	printf("Enter hour for rent : ");
	scanf("%lf", &rent_hour);
	pa
	if( rent_hour <= 5 ){
		double taxi_rent_print = rent_hour * 100;
		printf("Pay forrent is : %.2lf", taxi_rent_print);
	}else if( 6 <= rent_hour, rent_hour <= 10 ){
		double taxi_rent_print = (rent_hour * 100) + ((rent_hour - 5)* 90.50);
		printf("Pay forrent is : %.2lf", taxi_rent_print);
	}else if( 11 <= rent_hour, rent_hour <= 15 ){
 		double taxi_rent_print = (rent_hour * 100) + (rent_hour * 90.50) + ((rent_hour - 10)* 80);
		printf("Pay forrent is : %.2lf", taxi_rent_print);
	}else if( rent_hour >= 16 ){
		double taxi_rent_print = (rent_hour * 100) + (rent_hour * 90.50) + (rent_hour * 80) + ((rent_hour - 15)* 70.50);
		printf("Pay for rent is : %.2lf", taxi_rent_print);
	}
	printf("\n");
	pa
	
	getch();
}