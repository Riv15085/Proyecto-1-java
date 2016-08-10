Algoritmo funcionamiento
	Dimension nodos[5]
	contador = 1
	contador2 = 1
	pared = "xox"
	stack = 'inicio'
	Mientras pared != "final" Hacer
		leer pared
		Segun pared Hacer
			"xxo":
				sensor = "right"
			"oxx":
				sensor = "left"
			"xox":
				sensor = "up"
			"xoo":
				sensor = "up_right"
			"oox":
				sensor = "up_left"
			"oxo":
				sensor = "right_left"
			"ooo":
				sensor = "up_right_left"
			De Otro Modo:
				sensor = "atras"
		Fin Segun
		
		Segun sensor  Hacer
			"right_left":
				contador = contador +1
				nodos[contador]<- "crearNodo"
				Escribir "nodo creado"
				random = azar(3)
				Si random == 0 Entonces
					motorMover <- "right"
				Sino
					motorMover <- "left"
				Fin Si
			"up_left":
				contador = contador +1
				nodos[contador]<- "crearNodo"
				Escribir "nodo creado"
				random = azar(3)
				Si random == 0 Entonces
					motorMover <- "up"
				Sino
					motorMover <- "left"
				Fin Si
			"up_right":
				contador = contador +1
				nodos[contador]<- "crearNodo"
				Escribir "nodo creado"
				random = azar(3)
				Si random == 0 Entonces
					motorMover <- "right"
				Sino
					motorMover <- "up"
				Fin Si
				
			"up_right_left":
				contador = contador +1
				nodos[contador]<- "crearNodo"
				
				Escribir "nodo creado"
				random = azar(4)
				Si random == 0 Entonces
					motorMover <- "right"
				Fin Si
				Si random == 1 Entonces
					motorMover <- "left"
				Fin Si
				Si random == 2 Entonces
					motorMover <- "up"
				FinSi
				
			de otro modo: motorMover <- sensor
		FinSegun
		
		Si nodos[contador]= "crearNodo" Entonces
			stack = "inicio"
			nodos[contador]=stack
		Fin Si
		
		Segun motorMover  Hacer
			"left":
				mover <- " izquierda"
				Escribir "El robot se mueve hacia ", mover
			"right":
				mover <- " derecha"
				Escribir "El robot se mueve hacia ", mover
			"up":
				mover <- " adelante"
				Escribir "El robot se mueve hacia ", mover
			"atras":
				mover<- "dar_vuelta"
				Escribir "El robot da vuelta"
		FinSegun
		stack = concatenar(stack,mover)
		nodos[contador] = stack
		Escribir "la pila del nodo ", contador," va... ",nodos[contador]
	Fin Mientras
FinAlgoritmo
