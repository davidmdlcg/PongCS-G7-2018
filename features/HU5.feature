# language: es
Cartacter�stica: Destruir una pelota
    Con el fin de crear una sensaci�n de progreso
    Como jugador
    Quiero que mis disparos rompan las pelotas al tocarlas
    
    Escenario: Disparo
		Dado que la partida est� en curso
		Y que el jugador haya disparado
		Cuando el disparo toque la pelota
		Entonces la pelota tiene que desaparecer
		Y el siparo tiene que desaparecer
		Y otra pelota tiene que aparecer
		
		