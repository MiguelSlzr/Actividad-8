package Actividad8;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(2);
		
		String[] arregloNombres = {"Luis", "Juan", "Ana", "Maria", "Pedro", "Angel", "Rubi", "Sofia", "Francisco", "Jose"};
		Persona[] personaje = new Persona[10];
		int[] arregloRandom = new int[10];
		int[] A = new int[10];
		int k = A.length;

		int i = 0;
	
		String nombre = "";
		boolean tieneLentes;
		boolean haceEjercicio;
		
		boolean mayorDeEdad;
		boolean esAlto;
		boolean esEstudiante;
		boolean tieneTrabajo;
		boolean tieneFamilia;
		boolean tieneEnfermedad;
		
		Boolean[] arregloAtributos = {true, false, false, false, false, false, false, false};
		
		tieneLentes = arregloAtributos[0] ;
		haceEjercicio = arregloAtributos[1] ;
		
		mayorDeEdad = arregloAtributos[2] ;
		esAlto = arregloAtributos[3] ;
		esEstudiante = arregloAtributos[4] ;
		tieneTrabajo = arregloAtributos[5] ;
		tieneFamilia = arregloAtributos[6] ;
		tieneEnfermedad = arregloAtributos[7] ;
		
		for( i = 0; i <= 7; i++) {
			randomNumber = random.nextInt(2);
			System.out.println(randomNumber);
			
			if (randomNumber == 1) {
				arregloAtributos[i] = true;
			}
			else {
				arregloAtributos[i] = false;
			}
		}
		
		
		for( i = 0; i <= 7; i++) {

			
			System.out.println(arregloAtributos[i]);
		}
		
		System.out.println(tieneLentes + "hola");
		
		GrupoDePersonas1 persona1 = new GrupoDePersonas1("Juan", arregloAtributos[0], arregloAtributos[1], arregloAtributos[2], arregloAtributos[3]);
		
		System.out.println(tieneLentes + "hola");
		
		//persona1.setNombre(nombre);
		System.out.println(persona1.getNombre());
		
		persona1.setLentes(tieneLentes);
		System.out.println(persona1.getTieneLentes());
		
		persona1.setMayoriaEdad(mayorDeEdad);
		System.out.println(persona1.getMayorDeEdad());
		
		persona1.setEjercicio(haceEjercicio);
		System.out.println(persona1.getHaceEjercicio());
		
		persona1.setAlto(esAlto);
		System.out.println(persona1.getEsAlto());
		
		for( i = 0; i <= 9; i++) {
			A[i] = i;
		}
		
		
		randomNumber = random.nextInt(k);
		
		//personaje[i] = new GrupoDePersonas1(arregloNombres[B[randomNumber]]);
		
		//for( i = 0; i <= 9; i++) {	
		//	System.out.println(A[i]);
		//}
		

		
		
		
	}
}