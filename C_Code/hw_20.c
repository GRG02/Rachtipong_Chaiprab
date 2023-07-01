//File Name : hw_20.c
#include <stdio.h>
#include <conio.h>

#define CenPa printf("+++++++++++++++++++++++++++++++++++++++++++++++\n");
void main(){
		
	CenPa
	printf("\tProgram Profit and Commission\n");
	CenPa
	getValue();
	CenPa
	showProfit();
	CenPa
}

void getValue(){
	

	double totalSale;
	double productPrice;
	char employeeId[20];
		
	printf("Enter employee id is : " );
	scanf("%s",&employeeId);
	printf("Enter sale is : " );
	scanf("%lf",&totalSale);
	printf("Enter price is " );
	scanf("%lf",&productPrice);

}
double profitCal(double saleValue, double salePrice){
	double saleProfit = saleValue - salePrice;

	return saleProfit;
	
}

double commissionCal(double saleValue){
	double saleCommission = saleValue * 2/100;
	return saleCommission;
	
}

void showProfit(){

	double totalSale;
	double productPrice;
	printf("Profit is : %.2lf\n",profitCal(totalSale,productPrice));
	printf("Commission is : %.2lf\n",commissionCal(totalSale));
}








