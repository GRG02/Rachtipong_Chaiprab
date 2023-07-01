//B1.c
#include <conio.h>
#include <stdio.h>
#define pa printf("=================================\n");

char name[50];
int height;

int main(){
	pa
	printf("          Program    ^_^\n");
	pa
	printf("Enter your name : ");
	scanf("%s", &name);
	printf("Enter  your  height (cm) : ");
	scanf("%d", &height);
	pa
	printf("Height is : %d",height);
	printf(" cm.\n");
	printf("Name is : %s\n",name);
	pa
	
	getch();
}
