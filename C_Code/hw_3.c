//B3.c
#include <conio.h>
#include <stdio.h>
#define pa printf("=================================\n");

int widths;
int longs;

int main(){
	pa
	printf("      Program  Square Area\n");
	pa
	printf("Enter widths : ");
	scanf("%d",&widths);
	printf("Enter longs : ");
	scanf("%d",&longs);
	pa
	int square_area = widths * longs;
	printf("Area of square is : %d\n",square_area);
	pa
	
	getch();
}
