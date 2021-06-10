import java.util.*;

public class Ejercicio7{
	public static void main(String[] args){
		int num;
		double porcentPares;
		double porcentImpares;
		double porcentCeros;
		int pares=0;
		int impares=0;
		int ceros=0;
		final int NUM_RULETA =15;

		//Variables globales de ciclo for
		for (int i=1;i<=NUM_RULETA;i++) {
			num=(int)(Math.random()*36);

			if (num==0) {
				ceros++;
			} 
			else if ((num % 2)==0) {
				pares++;
			} 
			else {
				impares++;
			}

			System.out.println(i+") Numero aleatorio generado: "+ num);
			System.out.println("\n");
		}

		porcentImpares=(impares*100)/NUM_RULETA;
		porcentCeros=(ceros*100)/NUM_RULETA;
		porcentPares=(pares*100)/NUM_RULETA;
		System.out.println("El porcentaje de Pares es: "+porcentPares);
		System.out.println("El porcentaje de Impares es: "+porcentImpares);
		System.out.println("El porcentaje de Ceros es: "+porcentCeros);	
	}
}
