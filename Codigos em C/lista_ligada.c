#include <stdio.h>
#include <stdlib.h>

// Estrutura do No
typedef struct No_st {
	int numero;
	struct No_st *prox;
} No;

void Nprint(No *n);

// Printa todos os nos da lista
void Nprint(No *n){
	printf("%d,", n->numero);
	if(n->prox != NULL){
		Nprint(n->prox);
	} else {
		printf("\n");
	}	
}

// Aloca um novo no na lista
No * alocar(int i, No *anterior){
	No* novo;
	
	novo = (No *) malloc(sizeof(No));
	
	novo->numero = i;
	if(anterior != NULL){
		anterior->prox = novo;
	}
	
	return novo;
}

int main(void){
	No* ponta = alocar(0, NULL);
	Nprint(ponta);
	No * primeiro = alocar(1, ponta);
	Nprint(ponta);	
}
