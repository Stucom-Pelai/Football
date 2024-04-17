package main;

public class Persona {
	protected String nombre;
	protected double altura;
	protected double peso;
	protected int edad;	
	protected static String genero="masculino";
	
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Persona() {
		super();
	}

	public static String getGenero() {
		return genero;
	}

	public static void setGenero(String genero) {
		
		Jugador.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void correr() {
		System.out.println("correr como  persona");
	}
	
}
