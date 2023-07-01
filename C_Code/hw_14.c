//hw_14
#include <conio.h>
#include <stdio.h>
#define pa printf("--------------------------\n");


int student_num;
float student_GPA;

int func_student( ){
	
	char student_id[20], student_name[50];
	
	printf("Student No. %d\n", student_num);
	printf("Enter student id : ");
	scanf("%s", &student_id);
	printf("Enter student name : ");
	scanf("%s", &student_name);
	printf("Enter student GPA : ");
	scanf("%f", &student_GPA);
}

int main(){
	
	short student_amount;
	
	pa
	printf("   Program Study Result\n");
	pa
	printf("Enter number of student : ");
	scanf("%d", &student_amount);
	pa
	for(student_num = 1 ; student_num <= student_amount ; ++student_num){
		func_student( );
		if( student_GPA >= 2.00 ){
		printf("Study result is : PASS\n\n");
		}else if( student_GPA < 2.00 ){
		printf("Study result is : NOT PASS\n\n");
		}
	}
	pa
	getch();
}