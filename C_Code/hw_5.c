//B5.c
#include <conio.h>
#include <stdio.h>
#define pa printf("=================================\n");

int main(){
	
	char product_name[50];
	double price_begin;
	
	pa
	printf("     Program  Product  Shop\n");
	pa
	printf("Enter product name : ");
	scanf("%s", &product_name);
	printf("Enter price begin : ");
	scanf("%lf", &price_begin);
	pa
	double sale_price = price_begin - ( price_begin * 10 / 100);
	printf("Price for sale is : %.4lf\n", sale_price);
	pa
	
	getch();
}