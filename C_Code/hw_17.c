//File Name : hw_17.c
#include <stdio.h>
#include <conio.h>

#define CenPa printf("++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

void main(){
	
	int i,totalHeight[500],totalAge[500];
	CenPa
	printf("\tProgram Person Weight-Height\n");
	CenPa
	for(i = 1;i <= 10; i++ ){

		totalHeight[i] = userInputHeight(i);
		totalAge[i] = userInputAge(i);
	}
	CenPa
	printf("#Age > 15 and Height > 175 is : %d\n",heightAgeCmp1(totalHeight,totalAge,i));
	
	printf("#Age > 20 and Height > 160 is : %d\n",heightAgeCmp2(totalHeight,totalAge,i));
	printf("Average Height is : %d\n", userAverageHeight(totalHeight,i));
	printf("Average Age is : %d\n", userAverageHeight(totalAge,i));
	CenPa
}

int userInputHeight(int i){
	
	int tHeight[500];
	printf("Person %d ::\n",i);
	printf("Enter height : ");
	scanf("%d",&tHeight[i]);
	return tHeight[i];
	
}

int userInputAge(int i){
	
	int tAge[500];
	printf("Enter age : ");
	scanf("%d",&tAge[i]);
	return tAge[i];
	
}	

int userAverageHeight(int tHeight[], int i){
	int average;
	int sum;
	for(i = 1; i <= 10; i++){;
		sum += tHeight[i];
	}
	average = sum / 10;
	return average;
}	

int userAverageAge(int tAge[], int i){
	int average;
	int sum;
	for(i = 1; i <= 10; i++){;
		sum += tAge[i];
	}
	average = sum / 10;
	return average;
}

int heightAgeCmp1(int tHeight[],int tAge[], int i){
	
	int result = 0;
	
	for(i = 1; i <= 10; i++)
		if(tAge[i] > 15 && tHeight[i] >= 175 ){
			result++;
		}
	return result;
	
}

int heightAgeCmp2(int tHeight[],int tAge[], int i){
	
	int result = 0;
	
	for(i = 1; i <= 10; i++)
		if(tAge[i] > 20 && tHeight[i] >= 160 ){
			result++;
		}
	return result;	
	
}