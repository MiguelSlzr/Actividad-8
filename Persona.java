package Actividad8;

public abstract class Persona {
	public String nombre;
	public boolean tieneLentes;
	public boolean haceEjercicio;

	
	
	
	
	public Persona(String nombre, boolean tieneLentes, boolean haceEjercicio){
		this.nombre = nombre;
		this.tieneLentes = tieneLentes;
		this.haceEjercicio = haceEjercicio;
	
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setLentes(boolean lentes){
		this.tieneLentes = lentes;
	}
	
	public boolean getTieneLentes() {
		return tieneLentes;
	}
	
	public void setEjercicio(boolean ejercicio){
		this.haceEjercicio = ejercicio;
	}
	
	public boolean getHaceEjercicio() {
		return haceEjercicio;
	}
	
	//DEBO ESCRIBIR TODOS LOS METODOS DE LAS 10 PERSONAS EN ESTA CLASE ABSTRACTA
}
