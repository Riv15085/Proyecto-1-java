#include "simpletools.h" // Include simple tools
#include "ping.h"
#include "abdrive.h"
#include <stdio.h>
#include <stdlib.h>
int lecturad (){
	int medicion;
	int distancia= ping_cm(9);
	//pause(200);
	if (distancia<25){
		return medicion= 1;
	}
	else {
		return medicion=0;
	}
}

int lecturai (){
	int medicion;
	int distancia= ping_cm(7);
	//pause(200);
	if (distancia<25){
		return medicion= 1;
	}
	else {;
		return medicion=0;
	}
}

int lecturaf (){
	int medicion;
	int distancia= ping_cm(8);
	//pause(200);
	if (distancia<15){
		return medicion= 1;
	}
	else {
		return medicion=0;
	}
}

int forward(){
	drive_rampStep(55,55);
	return 2;
}


int turn_rigt(){
  drive_speed(0,0);
  	pause(100);
  drive_goto(25,25);
	drive_goto(26,-26);
	pause(100);
  drive_goto(75,75);
	//drive_goto(50,50);
	return 0;
}

int turn_left(){
    drive_speed(0,0);
    	pause(100);
   drive_goto(25,25);
	drive_goto(-26,26);
	pause(100);
  drive_goto(75,75);
	//drive_goto(50,50);
	return 1;
}
int turn_180(){
  drive_speed(0,0);
  pause(100);
  drive_goto(-50,50);
  pause(200);
  return 1;
}  


int decision_ida(int derecha, int izquierda, int recto){  
      //regreso
    if (recto==1 && derecha == 1 && izquierda == 1){
      return  turn_180();        
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
      return  turn_rigt();
              
    }
    
    if (derecha == 0 && izquierda == 0 && recto==1 ){
      return  turn_rigt();
              
    }
    
    if (derecha == 1 && izquierda == 0  &&   recto==0 ){
      return forward();
              
    }
    
    if (derecha == 0 && izquierda == 1   && recto==0 ){
      return turn_rigt();              
    }
}  

int main()                                    // Main function
{

 
  while(1)
  {
    int decision= decision_ida(lecturad(), lecturai(), lecturaf());
    
  }  
}

