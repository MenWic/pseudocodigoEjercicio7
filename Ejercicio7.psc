Proceso Ejercicio7
	pares = 0
	impares = 0
	nulos = 0
	Escribir " Se generarán 15 número aleatorios y se indicará el porcentaje de número pares, impares y nulos "
	Para i=1 Hasta 15 Con Paso 1 Hacer
		n = azar(36+1)
		div = n % 2
		Escribir n
		
		si n = 0 Entonces
			nulos = nulos + 1
		siNo
			si div = 0 Entonces
				pares = pares + 1
			SiNo
				impares = impares + 1	
			FinSi
		FinSi
	FinPara
	
	percentPares = (pares * 100)/15
	percentImpares = (impares * 100)/15
	percentNulos = (nulos * 100)/15
	
	Escribir "El porcentaje de pares es : " percentPares "%."
	Escribir "El porcentaje de impares es: " percentImpares "%."
	Escribir "El porcentaje de ceros es : " percentNulos "%."	
FinProceso
	