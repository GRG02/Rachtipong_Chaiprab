//File Name : hw_16 .c
#include <conio.h>
#include <stdio.h>

#define CenPa printf("++++++++++++++++++++++++++++++++++++++\n");


void main(){

	int i,x,numberValues[500];


  	
	CenPa
	printf("\tProgram Number\n");
	CenPa
	printf("Enter number total : ");
	scanf("%d",&x);
	CenPa
	
	for(i = 1; i <= x; i++){
		printf("Number %d : ",i);
		scanf("%d",&numberValues[i]);
		
	}

	CenPa
	printf("Minimum number is : %d\n",minCal(numberValues,x));	
	printf("Maximum number is : %d\n",maxCal(numberValues,x));			
	printf("Sum number is : %d\n",sumCal(numberValues,x));
	printf("Average number is : %d\n",averageCal(numberValues,x));
	

	CenPa
	getch();

}

int sumCal(int noValue[],int x){
		int sum = 0;
		int i;
		for(i = 1; i <= x; i++){
			sum += noValue[i];
	}
	return sum;
}
int averageCal(int noValue[],int x){
		int average;
		int sum;
		int i;
		for(i = 1; i <= x; i++){
			sum += noValue[i];
		
	}
	average = sum / x;
	return average;
}
int maxCal(int noValue[],int x){
  		int i;
  		int max;
		for (int i = 1; i <= x; i++) {     
        if(noValue[i] >= max)    
           max = noValue[i];    
	
	}
	return max;
}
int minCal(int noValue[],int x){
  		int i;
  		int min = noValue[1];
		for (int i = 1; i <= x; i++) {     
        if(noValue[i] <= min)    
           min = noValue[i];    
	
	}
	return min;
}