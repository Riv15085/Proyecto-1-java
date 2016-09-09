#include "simpletools.h" // Include simple tools
#include "ping.h"
#include "abdrive.h"
#include <stdio.h>
#include <stdlib.h>


/* Nos dice si hay que regresar a derecha, izquierda, atras */
int decision_regreso(int predecision) {
	if (predecision==0) {
		nright();
	}
	else if (predecision==1) {
		nleft();
	}
	else if (predecision==2) {
		backward();
	}
}


/*Generacion de numero Random dependiendo de los parametros que le mande*/
int generar_random(int min, int max) {
	int resultado = 0;
	srand(time(NULL));
	resultado = (rand()%(max-min)+min);
	return resultado;
}




/*Depende de lo que de el sensonr se genera un movimineto el cual dice como avanzara el motor*/
/*0 - False
1 - True
*/
int decision_ida(int derecha, int izquierda, int recto){
  int valido = 0; 
  int resultado;
  do{
    //resultado = generar_random(0,2);
    resultado = random %3;
    if  (resultado == 1 && izquierda == 0){
       int movimiento = turn_left();
       valido = 1;    
    }
    else if(resultado == 2 && recto == 0){
      int movimiento = forward();
       valido = 1;    
    }
    else if(resultado == 0 && derecha == 0){
      int movimiento = turn_rigt();
       valido = 1;    
    }        
  }
  while (valido == 0);
  return resultado;       
}  


int lecturad (){
	int medicion;
	int distancia= ping_cm(8);
	pause(200);
	if (distancia<10){
		return medicion= 1;
	}
	else {
		return medicion=0;
	}
}

int lecturai (){
	int medicion;
	int distancia= ping_cm(9);
	pause(200);
	if (distancia<10){
		return medicion= 1;
	}
	else {
		return medicion=0;
	}
}

int lecturaf (){
	int medicion;
	int distancia= ping_cm(10);
	pause(200);
	if (distancia<10){
		return medicion= 1;
	}
	else {
		return medicion=0;
	}
}
void nright(){
	drive_goto(-50,-50);
	pause(200);
	drive_goto(-26,26);
}
void nleft(){
	drive_goto(-50,-50);
	pause(200);
	drive_goto(26,-26);
}
int forward(){
	drive_goto(256,256);
	return 2;
}


void backward(){
	drive_goto(-256,-256);
}

int turn_rigt(){
	drive_goto(26,-26);
	pause(200);
	drive_goto(50,50);
	return 0;
}

int turn_left(){
	drive_goto(-26,26);
	pause(200);
	drive_goto(50,50);
	return 1;
}

int main() // Main function
{
	/*
	El 4 representa los siguientes atributos
	pos 0: Bandera que dice si podemos movernos a derecha, Boolean
	pos 1: Bandera que dice si podemos movernos a izquierda, Boolean
	pos 2: Bandera que dice si podemos movernos a frente, Boolean
	pos 3: Movimiento que se realizo (0 es derecha, 1 izquierda, 2 frente)
	*/
	int mat[1000][4];
	// Suponiendo que vamos de regreso
	// For (int i = 0.....
	for(int i=0; i<1000; i++){
        int fd=lecturad();
        int fi=lecturai();
        int fr=lecturaf();
        //print ("%c distnace = %d%c cm", HOME,i,CLREOL);
		if ((fd==1 && fi==1 &&fr==1 && i>0)){
			do{
				decision_regreso(mat[i-1][3]);
				i--;
			}
			while(mat[i][0]==1 && mat[i][1]==1 && mat[i][2]==1 && i>0);
			int decision= decision_ida(lecturad(), lecturai(), lecturaf());
			mat[i][3]=decision;
			mat[i][decision]=0;
		}
		else{
			int decision = decision_ida(fd, fi, fr);
			mat[i][0]=fd;	
			mat[i][1]=fi;
			mat[i][2]= fr;
			mat[i][3]=decision;
			mat[i][decision]=0;
		}
	}
}
