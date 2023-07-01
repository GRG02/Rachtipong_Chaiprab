//B6.c
#include <conio.h>
#include <stdio.h>
#define pa printf("=================================\n");

int main(){
	
	char employee_id[20], employee_name[50];
	double salary;
	
	pa
	printf("    Program  Salary  Employee\n");
	pa
	printf("Enter employee id : ");
	scanf("%s", &employee_id);
	printf("Enter employee name : ");
	scanf("%s", &employee_name);
	printf("Enter employee salary : ");
	scanf("%lf", &salary);
	pa
	double taxed_salary = salary - ( salary * 7 / 100) - 500;
	printf("Salary total is : %lf", taxed_salary);
	printf(" Bath\n");
	pa
 	
	getch();
}