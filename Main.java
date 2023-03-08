package Actividad8;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int randomNumber = random.nextInt(2);
		
		String[] arregloNombres = {"Luis", "Juan", "Ana", "Maria", "Pedro", "Angel", "Rubi", "Sofia", "Francisco", "Jose"};
		Persona[] personaje = new Persona[10];
		Persona[] personajeRandom = new Persona[10];
		Persona[] atributosPersona = new Persona[10];
		Persona[] atributosRandom = new Persona[10];
		int bandera = 0;
		
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[10];
		int[] D = new int[10];
		int[] primerGrupo = new int[5];
		int k = A.length;
	
		int[] contador = new int[6];
		int opcion;
		Persona adivinarPersonaje;

		String nombre = "";

		boolean[] arregloAtributos = {false, false, false, false, false, false, false, false};
		
		boolean tieneLentes = arregloAtributos[0];
		boolean haceEjercicio = arregloAtributos[1];
		boolean mayorDeEdad = arregloAtributos[2];
		boolean esAlto = arregloAtributos[3];
		boolean esEstudiante = arregloAtributos[4];
		boolean tieneTrabajo = arregloAtributos[5];
	
		
		String[] nombreAtributos = new String[8];
		nombreAtributos[0] = "tieneLentes";
		nombreAtributos[1] = "haceEjercicio";
		nombreAtributos[2] = "mayorDeEdad";
		nombreAtributos[3] = "esAlto";
		nombreAtributos[4] = "esEstudiante";
		nombreAtributos[5] = "tieneTrabajo";


		
		//LLENAR LOS ARREGLOS A, B y C
		for(int i = 0; i <= 9; i++) {
			A[i] = i;
		}
		for(int i = 0; i <= 9; i++) {
			B[i] = i;
		}
		for(int i = 0; i <= 9; i++) {
			C[i] = i;
		}
		for(int i = 0; i <= 9; i++) {
			D[i] = i;
		}
		
		
		for(int m = 0; m <= 4; m++) {
			//ELEGIR NUMERO ALEATORIO
			randomNumber = random.nextInt(k);

			//DEFINIR UN NOMBRE Y ATRIBUTOS
			for(int i = 0; i <= 7; i++) {
				randomNumber = random.nextInt(2);
				//System.out.println(randomNumber);
				
				if (randomNumber == 1) {
					arregloAtributos[i] = true;
				}
				else {
					arregloAtributos[i] = false;
				}
			}
			
			//ASIGNARLOS A UN OBJETO PERSONA
			
			GrupoDePersonas1 persona1 = new GrupoDePersonas1(arregloNombres[A[randomNumber]], arregloAtributos[0], arregloAtributos[1], arregloAtributos[2], arregloAtributos[3]);
			GrupoDePersonas1 atributosPersona1 = new GrupoDePersonas1(arregloAtributos[0], arregloAtributos[1], arregloAtributos[2], arregloAtributos[3]);
			
			randomNumber = random.nextInt(k);
			
			persona1.setNombre(arregloNombres[A[randomNumber]]);
			persona1.setLentes(arregloAtributos[0]);
			persona1.setEjercicio(arregloAtributos[1]);
			persona1.setMayoriaEdad(arregloAtributos[2]);
			persona1.setAlto(arregloAtributos[3]);
			

			System.out.println(persona1.getNombre() + ": " + nombreAtributos[0] + ": " + persona1.getTieneLentes() + ", " + nombreAtributos[1] + ": " + persona1.getHaceEjercicio() + ", " + nombreAtributos[2] + ": " + persona1.getMayorDeEdad() + ", " + nombreAtributos[3] + ": "+ persona1.getEsAlto());
			
			personaje[m] = persona1;
			atributosPersona[m] = atributosPersona1;
			
			
			//EJECUTAR EL DELETE
			int delete = A[randomNumber];
			for(int i = 0; i <= A.length-1; i++ ) {
				if (delete == A[i]) {
					for (int j = i; j <= A.length-2; j++) {
						A[j] = A[j+1];
					}
				}
			}
			//ACORTAR EL INTERVALO DE ELECCION ALEATORIA
			k -= 1;
		}	
		
		for(int m = 5; m <= 9; m++) {
			//ELEGIR NUMERO ALEATORIO
			randomNumber = random.nextInt(k);

			//DEFINIR UN NOMBRE Y ATRIBUTOS
			for(int i = 0; i <= 7; i++) {
				randomNumber = random.nextInt(2);
				//System.out.println(randomNumber);
				
				if (randomNumber == 1) {
					arregloAtributos[i] = true;
				}
				else {
					arregloAtributos[i] = false;
				}
			}
			
			//ASIGNARLOS A UN OBJETO PERSONA
			
			GrupoDePersonas2 persona2 = new GrupoDePersonas2(arregloNombres[A[randomNumber]], arregloAtributos[0], arregloAtributos[1], arregloAtributos[4], arregloAtributos[5]);
			GrupoDePersonas2 atributosPersona2 = new GrupoDePersonas2(arregloAtributos[0], arregloAtributos[1], arregloAtributos[4], arregloAtributos[5]);

			
			randomNumber = random.nextInt(k);
			
			persona2.setNombre(arregloNombres[A[randomNumber]]);
			persona2.setLentes(arregloAtributos[0]);
			persona2.setEjercicio(arregloAtributos[1]);
			persona2.setEstudiante(arregloAtributos[4]);
			persona2.setTrabajador(arregloAtributos[5]);
			

			System.out.println(persona2.getNombre() + ": " + nombreAtributos[0] + ": " + persona2.getTieneLentes() + ", " + nombreAtributos[1] + ": " + persona2.getHaceEjercicio() + ", " + nombreAtributos[4] + ": " + persona2.getEstudiante() + ", " + nombreAtributos[5] + ": "+ persona2.getTrabajador());
			
			personaje[m] = persona2;
			atributosPersona[m] = atributosPersona2;
			
			//EJECUTAR EL DELETE
			int delete = A[randomNumber];
			for(int i = 0; i <= A.length-1; i++ ) {
				if (delete == A[i]) {
					for (int j = i; j <= A.length-2; j++) {
						A[j] = A[j+1];
					}
				}
			}
			//ACORTAR EL INTERVALO DE ELECCION ALEATORIA
			k -= 1;
			
		}

		
		
		System.out.println(" ");	
		
		int i;
		
		
		for( i = 0; i <= 9; i++) {

			if(personaje[i].getTieneLentes()) {
				contador[0] += 1;
			}
			if(personaje[i].getHaceEjercicio()) {
				contador[1] += 1;
			}
			if(personaje[i].getMayorDeEdad()) {
				contador[2] += 1;
			}
			if(personaje[i].getEsAlto()) {
				contador[3] += 1;
			}
			if(personaje[i].getEstudiante()) {
				contador[4] += 1;
			}
			if(personaje[i].getTrabajador()) {
				contador[5] += 1;
			}
		}
		
			
			System.out.println("El numero de personas con lentes es: " + contador[0]);	
			System.out.println("El numero de personas que se ejercita es: " + contador[1]);
			System.out.println("El numero de adultos es: " + contador[2]);
			System.out.println("El numero de personas altas es: " + contador[3]);
			System.out.println("El numero de personas que estudian es: " + contador[4]);
			System.out.println("El numero de personas que trabajan es: " + contador[5]);

			System.out.println(" ");
			
		i=0;
		while(contador[0] < 2) {
			if(personaje[i].getTieneLentes() == tieneLentes) {
				personaje[i].setLentes(true);
				contador[0] += 1;
			}
			i++;
		}
		i=0;
		while(contador[1] < 2) {
			if(personaje[i].getHaceEjercicio() == haceEjercicio) {
				personaje[i].setLentes(true);
				contador[1] += 1;
			}
			i++;
		}
		i=0;
		while(contador[2] < 2) {
			if(personaje[i].getMayorDeEdad() == mayorDeEdad) {
				personaje[i].setMayoriaEdad(true);
				contador[2] += 1;
			}
			i++;
		}
		i=0;
		while(contador[3] < 2) {
			if(personaje[i].getEsAlto() == esAlto) {
				personaje[i].setAlto(true);
				contador[3] += 1;
			}
			i++;
		}
		i=0;
		while(contador[4] < 2) {
			if(personaje[i].getEstudiante() == esAlto) {
				personaje[i].setEstudiante(true);
				contador[4] += 1;
			}
			i++;
		}
		i=0;
		while(contador[5] < 2) {
			if(personaje[i].getEsAlto() == esAlto) {
				personaje[i].setTrabajador(true);
				contador[5] += 1;
			}
			i++;
		}
		
		
		
		
		//ENVIARLOS ALEATORIAMENTE A OTRA LISTA DE PERSONAJES
		k=10;
		int count = 0;
		for(int g = 0; g <=9; g++) {
			randomNumber = random.nextInt(k);
	
			for(int h=0; h<=B.length-1;h++) {

				if(B[randomNumber] == B[h]){
			
					personajeRandom[B[randomNumber]] = personaje[g];
					atributosRandom[B[randomNumber]] = atributosPersona[g];
					
					if(g <= 4) {
						
						primerGrupo[count]= B[randomNumber];
						count++;
					
					}
					int delete = B[randomNumber];
					for( i = 0; i <= B.length-1; i++ ) {
						if (delete == B[i]) {
							for (int j = i; j <= B.length-2; j++) {
								B[j] = B[j+1];
							}
						}
					}
					break;
				}
			}
			k-= 1;
		}
		
		//IMPRIMIR EL NUEVO ORDEN DE LOS OBJETOS PERSONA
		for( i = 0; i <= 9; i++ ) {
			for(int j = 0; j < 5; j++) {
				if(i == primerGrupo[j]) {
					System.out.println(i + " " + personajeRandom[i].getNombre() + ": " + nombreAtributos[0] + ": " + personajeRandom[i].getTieneLentes() + ", " + nombreAtributos[1] + ": " + personajeRandom[i].getHaceEjercicio() + ", " + nombreAtributos[2] + ": " + personajeRandom[i].getMayorDeEdad() + ", " + nombreAtributos[3] + ": " + personajeRandom[i].getEsAlto());
					bandera = 1;
				}
			}
			
			if(bandera == 0) {
				System.out.println(i + " " + personajeRandom[i].getNombre() + ": " + nombreAtributos[0] + ": " + personajeRandom[i].getTieneLentes() + ", " + nombreAtributos[1] + ": " + personajeRandom[i].getHaceEjercicio() + ", " + nombreAtributos[4] + ": " + personajeRandom[i].getEstudiante() + ", " + nombreAtributos[5] + ": " + personajeRandom[i].getTrabajador());
			}
			bandera = 0;
		}

		
		System.out.println(" ");	
		System.out.println("El numero de personas con lentes es: " + contador[0]);	
		System.out.println("El numero de personas que se ejercita es: " + contador[1]);
		System.out.println("El numero de adultos es: " + contador[2]);
		System.out.println("El numero de personas altas es: " + contador[3]);
		System.out.println("El numero de personas que estudian es: " + contador[4]);
		System.out.println("El numero de personas que trabajan es: " + contador[5]);
		System.out.println(" ");
		
		int j = 0;
		int max = 0;
		int topCounter = 0;
		int fixChar = 0;
		boolean banderaBoolean;
		for(i = 0; i < personajeRandom.length; i++) {
			for(j = 0; j <= personajeRandom.length-1; j++) {
				if(personajesIguales(personajeRandom[i], personajeRandom[j]) != null) {
					fixChar = j;
					System.out.println(personajeRandom[fixChar].getNombre());
					
					
					banderaBoolean = true;
					while(banderaBoolean) {
					for(k = 0; k < contador.length; k++) {
						if(max < contador[k]){
							max = contador[k];
							topCounter = k;
							
						}
					}
				
					
					if (topCounter == 0) {
						if(personajeRandom[fixChar].getTieneLentes()) {
							personajeRandom[fixChar].setLentes(false);
							contador[topCounter] -=1;
						}
						else{
							personajeRandom[fixChar].setLentes(true);
							contador[topCounter] +=1;
						}
					}
					if (topCounter == 1) {
						if(personajeRandom[fixChar].getHaceEjercicio()) {
							personajeRandom[fixChar].setEjercicio(false);
							contador[topCounter] -=1;
						}
						else{
							personajeRandom[fixChar].setEjercicio(true);
							contador[topCounter] +=1;
						}
					}
					if (topCounter == 2) {
						if(personajeRandom[fixChar].getEsAlto()) {
							personajeRandom[fixChar].setAlto(false);
							contador[topCounter] -=1;
						}
						else{
							personajeRandom[fixChar].setAlto(true);
							contador[topCounter] +=1;
						}
					}
					if (topCounter == 3) {
						if(personajeRandom[fixChar].getMayorDeEdad()) {
							personajeRandom[fixChar].setMayoriaEdad(false);
							contador[topCounter] -=1;
						}
						else{
							personajeRandom[fixChar].setMayoriaEdad(true);
							contador[topCounter] +=1;
						}
					}
					if (topCounter == 4) {
						if(personajeRandom[fixChar].getEstudiante()) {
							personajeRandom[fixChar].setEstudiante(false);
							contador[topCounter] -=1;
						}
						else{
							personajeRandom[fixChar].setEstudiante(true);
							contador[topCounter] +=1;
						}
					}
					if (topCounter == 5) {
						if(personajeRandom[fixChar].getTrabajador()) {
							personajeRandom[fixChar].setTrabajador(false);
							contador[topCounter] -=1;
						}
						else{
							personajeRandom[fixChar].setTrabajador(true);
							contador[topCounter] +=1;
						}
					}
					banderaBoolean = false;
					
					
					
					System.out.println(personajeRandom[fixChar].getNombre() + ": " + nombreAtributos[0] + ": " + personajeRandom[fixChar].getTieneLentes() + ", " + nombreAtributos[1] + ": " + personajeRandom[fixChar].getHaceEjercicio() + ", " + nombreAtributos[4] + ": " + personajeRandom[fixChar].getEstudiante() + ", " + nombreAtributos[5] + ": " + personajeRandom[fixChar].getTrabajador());
					
					for(int l = 0; l < personajeRandom.length; l++) {
						if(personajeRandom[fixChar] != personajeRandom[k]) {
							if(personajesIguales(personajeRandom[fixChar], personajeRandom[k]) != null) {
								fixChar = l;
								banderaBoolean = true;
								break;
							}
						}
					}
					}
				}
				
			}
		}
		
		for( i = 0; i <= 9; i++ ) {
			for( j = 0; j < 5; j++) {
				if(i == primerGrupo[j]) {
					System.out.println(i + " " + personajeRandom[i].getNombre() + ": " + nombreAtributos[0] + ": " + personajeRandom[i].getTieneLentes() + ", " + nombreAtributos[1] + ": " + personajeRandom[i].getHaceEjercicio() + ", " + nombreAtributos[2] + ": " + personajeRandom[i].getMayorDeEdad() + ", " + nombreAtributos[3] + ": " + personajeRandom[i].getEsAlto());
					bandera = 1;
				}
			}
			
			if(bandera == 0) {
				System.out.println(i + " " + personajeRandom[i].getNombre() + ": " + nombreAtributos[0] + ": " + personajeRandom[i].getTieneLentes() + ", " + nombreAtributos[1] + ": " + personajeRandom[i].getHaceEjercicio() + ", " + nombreAtributos[4] + ": " + personajeRandom[i].getEstudiante() + ", " + nombreAtributos[5] + ": " + personajeRandom[i].getTrabajador());
			}
			bandera = 0;
		}
		//---------------------------------------------------------------------------------------------------
	System.out.println("Bienvenido al juego adivina quien creado por mi(version aun en desarrollo)");
		System.out.println("Este juego consiste de 3 preguntas que usted va a escoger para adivinar al personaje: ");
		randomNumber = random.nextInt(10);
		adivinarPersonaje = personajeRandom[randomNumber];
		System.out.println(" ");	
		System.out.println("Escoja una de las siguientes preguntas: ");
		System.out.println("1. ¿El personaje tiene lentes?");
		System.out.println("2. ¿El personaje hace ejercicio?");
		System.out.println("3. ¿El personaje va a la escuela?");
		System.out.println("4. ¿El personaje tiene trabajo?");
		System.out.println("5. ¿El personaje es mayor de edad?");
		System.out.println("6. ¿El personaje es alto?");
		
		
		i = 0;
		j = 2;
		
		
		while(i <= 2) {
			opcion = scan.nextInt();
			switch(opcion) {
			case 1:
				if(adivinarPersonaje.getTieneLentes()) {
					System.out.println("El personaje sí tiene lentes");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
							if(personajeRandom[x].getTieneLentes() == false) {
								personajeRandom[x] = null;
							}
						}
					}
				
				}else {
					System.out.println("El personaje no tiene lentes");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
							if(personajeRandom[x].getTieneLentes()) {
								personajeRandom[x] = null;
							}
						}
					}
				}
				System.out.println("Quedan " + j + " preguntas disponibles");
				break;
				
			case 2:
				if(adivinarPersonaje.getHaceEjercicio()) {
					System.out.println("El personaje sí hace ejercicio");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
							if(personajeRandom[x].getHaceEjercicio() == false) {
								personajeRandom[x] = null;
							}
						}
					}
					
				}else {
					System.out.println("El personaje no hace ejercicio");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
							if(personajeRandom[x].getHaceEjercicio()) {
								personajeRandom[x] = null;
							}
						}
					}
					
				System.out.println("Quedan " + j + " preguntas disponibles");
				}
				break;
			
			case 3:
				if(adivinarPersonaje.getEstudiante()) {
					System.out.println("El personaje sí es estudia");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
							if(personajeRandom[x].getEstudiante() == false) {
								personajeRandom[x] = null;
							}
						}
					}
				}else {
					System.out.println("El personaje no estudia");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
							if(personajeRandom[x].getEstudiante()) {
								personajeRandom[x] = null;
							}
						}
					}
				}
				System.out.println("Quedan " + j + " preguntas disponibles");
				break;
			
			case 4:
				if(adivinarPersonaje.getTrabajador()) {
					System.out.println("El personaje sí trabaja");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
						if(personajeRandom[x].getTrabajador() == false) {
							personajeRandom[x] = null;
						}
						}
					}
				}else {
					System.out.println("El personaje no trabaja");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
						if(personajeRandom[x].getTrabajador()) {
							personajeRandom[x] = null;
						}
						}
					}
				}
				System.out.println("Quedan " + j + " preguntas disponibles");
				break;
			
			case 5:
				if(adivinarPersonaje.getMayorDeEdad()) {
					System.out.println("El personaje es adulto");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
						if(personajeRandom[x].getMayorDeEdad() == false) {
							personajeRandom[x] = null;
						}
						}
					}
				}else {
					System.out.println("El personaje no es adulto");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
						if(personajeRandom[x].getMayorDeEdad()) {
							personajeRandom[x] = null;
						}
						}
					}
				}
				System.out.println("Quedan " + j + " preguntas disponibles");
				break;
			
			case 6:
				if(adivinarPersonaje.getEsAlto()) {
					System.out.println("El personaje sí es alto");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
						if(personajeRandom[x].getEsAlto() == false) {
							personajeRandom[x] = null;
						}
						}
					}
				}else {
					System.out.println("El personaje no es alto");
					for(int x = 0; x < personajeRandom.length; x++) {
						if(personajeRandom[x] != null) {
						if(personajeRandom[x].getEsAlto()) {
							personajeRandom[x] = null;
						}
						}
					}
				}
				System.out.println("Quedan " + j + " preguntas disponibles");
				break;
			
			default:
				System.out.println("Esa no es una opción, por favor vuelva a intentar... tiene un intento menos");
			break;
			}
			
			System.out.println(" ");
			System.out.println("El personaje a adivinar ahora está entre estos:");
			
			for(int x = 0; x <= 9; x++) {
				if(personajeRandom[x] != null) {
					System.out.println(x + ". " + personajeRandom[x].getNombre());
				}
			}
	
			i++;
			j--;
			
			System.out.println(" ");
		
			
				
		}
		
		System.out.println("Ahora adivine quién es el personaje (solo escriba el número de la persona):");
		opcion = scan.nextInt();
	if(opcion == randomNumber) {
		System.out.println("Felicidades! Usted ha acertado.");
	}else {
		System.out.println("Incorrecto. Gracias por jugar. El personaje a adivinar era: " + personajeRandom[randomNumber].getNombre());
	}
		

		
		
		
		
		
	}
	
	
	
	
	public static Persona personajesIguales(Persona personaUno, Persona personaDos) {
		
		if(personaUno == personaDos) {
			return null;
		}
		if(personaUno.getTieneLentes() == personaDos.getTieneLentes()) {
			if(personaUno.getHaceEjercicio() == personaDos.getHaceEjercicio()) {
				if(personaUno.getMayorDeEdad() == personaDos.getMayorDeEdad()) {
					if(personaUno.getEsAlto() == personaDos.getEsAlto()) {
						if(personaUno.getEstudiante() == personaDos.getEstudiante()) {
							if(personaUno.getTrabajador() == personaDos.getTrabajador()) {
								System.out.println(personaUno.getNombre() + " es igual a " + personaDos.getNombre());
								return personaDos;
							}
						}
					}
				}
			}
		}
		return null;
	}
}