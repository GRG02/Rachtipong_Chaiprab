//hw_13
#include <conio.h>
#include <stdio.h>
#define pa printf("++++++++++++++++++++++++++++++++\n");

int main(){
	
	char head_name[50], head_tele_num[10];
	short member_amount;
	
	pa
	printf("     Program  Package Tour\n");
	pa
	printf("Enter name of head group : ");
	scanf("%s", &head_name);
	printf("Enter telephone number of head group : ");
	scanf("%s", &head_tele_num);
	printf("Enter number of group : ");
	scanf("%d", &member_amount);
	pa
	if( 1 <= member_amount, member_amount <= 2){
		short tour_price = member_amount * 300;
		printf("Pay for package tour is : %d", tour_price);
	}else if( 3 <= member_amount, member_amount <= 5){
		short tour_price = member_amount * 250;
		printf("Pay for package tour is : %d", tour_price);
	}else if( 6 <= member_amount, member_amount <= 10){
		short tour_price = member_amount * 210;
		printf("Pay for package tour is : %d", tour_price);
	}else if( 11 <= member_amount ){
		short tour_price = member_amount * 150;
		printf("Pay for package tour is : %d", tour_price);
	}
	printf("\n");
	pa
	
	getch();
}