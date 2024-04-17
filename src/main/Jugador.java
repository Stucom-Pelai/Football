package main;

public class Jugador extends Persona implements Profesional,Capitan{
	
	private int dorsal;
	private String position;
	

	public Jugador() {

	}

	public Jugador(String nombre, int dorsal, String position) {
		//nombre
		super(nombre);
		this.dorsal = dorsal;
		this.position = position;

	}

	
	

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	

	
	

	public boolean marcarGol() {
		return true;

	}

	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", position=" + position + "]";
	}
	
	public void correr() {
		System.out.println("correr como  jugador");
	}

	@Override
	public void estarFederado() {
		// TODO Auto-generated method stub
		System.out.println("me federo");
		
	}

	@Override
	public void tieneSalario() {
		// TODO Auto-generated method stub
		System.out.println("cobro salario");
	}

	@Override
	public void lideraEquipo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void llevaBrazalete() {
		// TODO Auto-generated method stub
		
	}

	
}
