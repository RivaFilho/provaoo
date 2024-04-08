package prova;
/*O type casting, em Java, é o *processo de converter um tipo de dado em outro*. 
isso é útil quando você deseja atribuir um valor de um tipo de dado a uma variável de outro tipo, 
desde que a conversão seja possível e segura.*/
public class ex2 {
// Exemplo 1: Conversão implícita de int para double
int numInteiro = 10;
double numDouble = numInteiro;

// Exemplo 2: Conversão implícita de char para int
char caractere = 'A';
int valorInt = caractere;
// Exemplo 1: Conversão explícita de double para int
double numDouble2 = 10.5;
int numInteiro2 = (int) numDouble;

// Exemplo 2: Conversão explícita de long para int
long numLongo = 1000000L;
int numInteiro3 = (int) numLongo;


}
