package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Equipo2 {
	String entrenador;
	//static Jugador[] jugadores = new Jugador[11];
	static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	String staff;
	final static int NUMERO_JUGADORES = 11;

	public static void main(String[] args) {
		// crear jugador1
		Jugador jug1 = new Jugador();
		jug1.setNombre("Antonios");
		jug1.setDorsal(10);
		jug1.setPosition("Delantero");
		//numeroJugadores =12;
	
		// crear jugador2
		Jugador jug2 = new Jugador("Juan", 12, "Defensa");
		
		// almacenar en array		
		//jugadores[0] = jug2;
		//jugadores[1] = jug1;
		jugadores.add(jug2);
		jugadores.add(jug1);
		
//		for (Iterator iterator = jugadores.iterator(); iterator.hasNext();) {
//			Jugador jugador = (Jugador) iterator.next();
//			System.out.println(jugador);
//		}
		
		for (int i = 0; i < jugadores.size(); i++) {
			System.out.println(jugadores.get(i));
		}
		
		
		// ejemplo static modificador
		// static attribute
		System.out.println(jug1.getGenero());
		System.out.println(jug2.getGenero());
		Jugador.setGenero("femenino");		
		System.out.println(jug1.getGenero());
		System.out.println(jug2.getGenero());
		//static method
		jugar("ofensivo");		
		Equipo2 equipo1 = new Equipo2();
		equipo1.presionar();
		
		// modificadores		
		
		//jug1.altura=0.0;
		Arbitro arb = new Arbitro();
		
		//System.out.println("edad jug1:" + jug1.getEdad());		
		//jug2.setEdad(12);
		
		
		
		
		
		
		
		

	}
	
	public static void jugar(String estilo) {
		
		
	}
	
	public void presionar() {
		
		
	}
	
	public void descansar() {
		
		
	}

}
