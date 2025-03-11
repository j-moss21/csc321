//Julen Moss
//
//
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int i, a = 0;
	double b = 10;
	float c = 100;
	char d = 'A';
	int arr[10] = {1,2,3,4,5,6,7,8,9,10};

	printf("the value of a is %d and its address is %p \n",a,&a);
	printf("the value of b is %lf and its address is %p \n",b,&b);
	printf("the value of c is %f and its address is %p \n",c,&c);
        printf("the value of d is %d and its address is %p \n",d,&d);

	for (i = 0; i < 10; i++)
	{
		printf("address of arr[%d} = %p \n", arr[i],&arr[i]);
		int x =6;
	}	
 

    
    printf("x is %d\n", x);
	


	return EXIT_SUCCESS;


 
}
