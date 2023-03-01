package Actividad8;

public abstract class Persona {
	public String nombre;
	public boolean tieneLentes = true;
	public boolean haceEjercicio = true;
	public boolean mayoriaEdad = true;
	public boolean esAlto = true;
	
	//ESTOS NO FUNCIONAN SI NO SON PUBLICOS
	
	
	public Persona(String nombre, boolean tieneLentes, boolean haceEjercicio){
		this.nombre = nombre;
		this.tieneLentes = tieneLentes;
		this.haceEjercicio = haceEjercicio;
	
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setLentes(boolean lentes){
		this.tieneLentes = lentes;
	}
	
	public void setEjercicio(boolean ejercicio){
		this.haceEjercicio = ejercicio;
	}
	
	
	
	public void setMayoriaEdad(boolean edad){
		this.mayoriaEdad = edad;
	}
	
	public void setAlto(boolean altura){
		this.esAlto = altura;
	}
	
	public abstract String getNombre();
	public abstract boolean getTieneLentes();
	public abstract boolean getMayorDeEdad();
	public abstract boolean getHaceEjercicio();
	public abstract boolean getEsAlto();
	
	//DEBO ESCRIBIR TODOS LOS METODOS DE LAS 10 PERSONAS EN ESTA CLASE ABSTRACTA
}