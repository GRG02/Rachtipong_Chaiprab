//B4.c
#include <conio.h>
#include <stdio.h>
#define pa printf("=================================\n");

int main(){
	double widths;
	double longs;
	double highs;
	
	pa
	printf("          Program  Color\n");
	pa
	printf("Enter widths : ");
	scanf("%lf", &widths);
	printf("Enter longs : ");
	scanf("%lf", &longs);
	printf("Enter highs : ");
	scanf("%lf", &highs);
	pa
	double room_area = widths * longs * highs / 3;
	printf("Color for use is : %.2lf", room_area);
	printf(" Gallon\n");
	pa
	
	getch();
}