//hw_15
#include <conio.h>
#include <stdio.h>
#include <string.h>
#define pa printf("++++++++++++++++++++++++++\n");

int result;

int func_A(){
	
	double rent_price;
	double water_used;
	double electric_used;
	
	printf("Enter rent per room : ");
	scanf("%lf", &rent_price);
	printf("Enter unit water use : ");
	scanf("%lf", &water_used);
	printf("Enter unit electric use : ");
	scanf("%lf", &electric_used);
	float total_price = rent_price + ( water_used * 12.50 ) + ( electric_used * 8.00 );
	printf("Pay money total for rent room : %.2lf", total_price);
	printf("\n\n");
	return 0;
}

int func_X(){
	
	char name[50];
	
	printf("Enter name : ");
	scanf("%s", &name);
	result = strcmp(name,"x");
	return result;
}

/*int func_select(){
	if(result == 0){
			func_X();	
		}else{
			func_A();
		}
}*/

int main(){
	
	int room_num;
	
	pa
	printf("    Program  Rent Room\n");
	pa
	for( room_num = 1 ; room_num <= 10 ; ++room_num){
		printf("Room No. %d\n", room_num);
		func_X();
		if(result != 0){
			func_A();
		}		
	}
}