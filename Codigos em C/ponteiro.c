#include <stdio.h>

int ponteiro(int *p);
int valor(int v);

int ponteiro(int *p){
	*p += 10;
	return 0;
}

int valor(int v){
	return v+5;
}

int main(void){
	int b = 50;
	int *a = &b;
		
	printf("%d\n", ponteiro(a));
	printf("%d\n", *a);
	printf("%d\n", valor(b));
		
}
