#include "simpletools.h" // Include simple tools
#include "ping.h"
#include "abdrive.h"
#include <stdio.h>
#include <stdlib.h>


/* Nos dice si hay que regresar a derecha, izquierda, atras */
void decision_regreso(int predecision) {
	if (predecision==0) {
		turn_rigtInv();
	}
 
	if (predecision==1) {
		turn_leftInv();
	}
 
	if (predecision==2) {
		backward();
	}
}

/*Depende de lo que de el sensonr se genera un movimineto el cual dice como avanzara el motor*/
/*0 - False
1 - True
*/
int decision_ida(int derecha, int izquierda, int recto){  
      //regreso
    if (recto==1 && derecha == 1 && izquierda == 1){
      return  2;        
    }
            
    if(derecha==0  && izquierda == 1 && recto == 1 ){
      return  turn_rigt();

    }    
    
    if(derecha == 1 && izquierda==0  && recto==1 ){
      return  turn_left();
           
    }

    if(derecha == 1 && izquierda==1  && recto==0 ){
      return forward();
           
    }
            
    if (derecha == 0  && izquierda == 0 && recto==0 ){
      return  forward();
              
    }
    
    if (derecha == 0 && izquierda == 0 && recto==1 ){
      return  turn_left();
              
    }
    
    if (derecha == 1 && izquierda == 0  &&   recto==0 ){
      return forward();
              
    }
    
    if (derecha == 0 && izquierda == 1   &&recto==0 ){
      return forward();              
    }
}  


int lecturad (){
	int medicion;
	int distancia= ping_cm(8);
	pause(200);
	if (distancia<25){
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
	if (distancia<25){
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
	if (distancia<25){
		return medicion= 1;
	}
	else {
		return medicion=0;
	}
}

int forward(){
	drive_goto(55,55);
	return 2;
}


void backward(){
	drive_goto(-55,-55);
}

int turn_rigt(){
	drive_goto(26,-26);
	pause(200);
	//drive_goto(50,50);
	return 0;
}

void turn_rigtInv(){
   //drive_goto(-50,-50);
  pause(200);                        // Repeat indefinitely
  drive_goto(-26,26);
}

void turn_leftInv(){
   //drive_goto(-50,-50);
  pause(200);                        // Repeat indefinitely
  drive_goto(26,-26);
}

int turn_left(){
	drive_goto(-26,26);
	pause(200);
	//drive_goto(50,50);
	return 1;
}

int main() // Main function
{
	/*
	El 4 representa los siguientes atributos
	pos 0: Bandera que dice si podemos movernos a derecha, Boolean
	pos 1: Bandera que dice si podemos movernos a izquierda, Boolean
	pos 2: Bandera que dice si podemos movernos a frente, Boolean
	pos 3: Movimiento que se realizo
	*/
	int mat[1000][4];
	// Suponiendo que vamos de regreso
	// For (int i = 0.....

	for(int i=0; i<1000; i++){
            int fd=lecturad();
            int fi=lecturai();
            int fr=lecturaf();
            //se cambio la logica haciendo l  as tres paredes primero
  
    				int decision= decision_ida(fd, fi, fr);
    				mat[i][0]=fd;	//terminar
    				mat[i][1]=fi;
    				mat[i][2]=fr;
    				mat[i][3]=decision;
    				mat[i][decision]=1;


      // Este if es cuando llega a el tope. tiene que regresar
      if ((mat[i][0]==1 && mat[i][1]==1 && mat[i][2]==1)){
          //decision_regreso(mat[i][3]); 
          //regreso hasta la ultima bifurcacion
    			while (mat[i-1][0]==1 && mat[i-1][1]==1 && mat[i-1][2]==1){
    				decision_regreso(mat[i][3]);
    				i = i -1;
        }          
          int decision= decision_ida(mat[i][0],mat[i][1],mat[i][2]);
			   mat[i][3]=decision;
			   mat[i][decision]=0;				
     }    
	} 
}
