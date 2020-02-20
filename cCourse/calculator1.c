#include<stdio.h>
#include<math.h>
int main()
{
	float num1;
	float num2;
	int operator; 
	float result;
	scanf(" enter the 1st number:\n %f", &num1);
	scanf(" enter the 2nd number:\n %f", &num2);
	scanf(" 1 = sum.\n 2 = substraction.\n 3 = multiplication.\n 4 = division.\n choose the number of the operator:\n %d", &operator);
	if (operator==1)
	{
		result= num1 + num2;
		printf(" the result is:\n %.2f", &result);
	}
	else if (operator==2)
	{
		result= num1 - num2;
		printf(" the result is:\n %.2f", &result);
	}
	else if (operator==3)
	{
		result= num1 * num2;
		printf(" the result is:\n %.2f", &result);
	}
	else if (operator==4)
	{
		result= num1/num2;
		printf(" the result is:\n %.2f", &result);
	}
	else 
	{ 
		printf("ERROR\n");
	}
	return 0;
}