//File Name : hw_19.c
#include <stdio.h>
#include <conio.h>

#define CenPa printf("++++++++++++++++++++++++++++++++++++++\n");
void main(){
		
	CenPa
	printf("\tProgram Side of Triangle\n");
	CenPa
	getValue();
	CenPa
	showTriangle();
	CenPa
}

void getValue(){
	
	float triangleNo1,triangleNo2,triangleNo3;
	printf("Enter width side 1 of triangle : " );
	scanf("%f",&triangleNo1);
	printf("Enter width side 2 of triangle : " );
	scanf("%f",&triangleNo2);
	printf("Enter width side 3 of triangle : " );
	scanf("%f",&triangleNo3);
	
}

void showTriangle(){
	float triangleNo1,triangleNo2,triangleNo3;
	if(triangleNo1 + triangleNo2 > triangleNo3 && triangleNo1 + triangleNo3 > triangleNo2 && triangleNo2 + triangleNo3 > triangleNo1 ){
		printf("Sides is Yes\n");
	}
	else{
		printf("Sides is No\n");
	}
	
}