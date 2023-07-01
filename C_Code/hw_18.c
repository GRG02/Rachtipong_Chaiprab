//File Name : hw_18.c
#include <stdio.h>
#include <conio.h>

#define CenPa printf("++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
void main(){
		
	CenPa
	printf("\tProgram Color Gallon\n");
	CenPa
	getValue();
	CenPa
	showGallon();
	CenPa
}

void getValue(){
	
	float roomWidths,roomLongs,roomHeights;
	printf("Enter widths of room : " );
	scanf("%f",&roomWidths);
	printf("Enter longs of room : " );
	scanf("%f",&roomLongs);
	printf("Enter Heights of room : " );
	scanf("%f",&roomHeights);
	
}

float galloncalulate(float widths,float longs,float heights){
	float gallonUse = widths*longs*heights/250;
	return gallonUse;
	
}

void showGallon(){
	float roomWidths,roomLongs,roomHeights;
	printf("Use color is : %.2f gallon\n",galloncalulate(roomWidths,roomLongs,roomHeights));
	
	
}