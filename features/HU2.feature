# language: es
Cartacter�stica: Generaci�n periodica de pelotas
    Con el fin de aumentar la dificultad del juego
    Como jugador
    Quiero que cada 10 segundos se genere una nueva pelota
	
	Antecedentes:
		Dado que la parida esta en curso
		
    Escenario: Generaci�n de pelota
		Dado que se ha generado la primera pelota
		Cuando se cumplan diez segundos despu�s de la aparici�n de una pelota
		Entonces otra pelota tiene que aparecer
		
	Escenario: Reinicio del contador
		Dado que el usuario ha destruido un pelota
		Y se haya generado una nueva pelota
		Cuando se cumplan diez segundos despu�s de la aparici�n de la nueva pelota
		Entonces otra pelota tiene que aparecer
		Pero no tiene que aparecer otra antes
		