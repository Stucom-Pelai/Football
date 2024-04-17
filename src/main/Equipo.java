package main;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Equipo {
	String entrenador;
	//0. definicion
	//static Jugador[] jugadores;
	static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	static int numeroJugadores=0;
	final static int MAX_NUMERO_JUGADORES = 11;
	String staff;

	public static void main(String[] args) throws IOException {
		// crear jugadores
		// usando hardcodes
		// crear jugador1
		
		
		Jugador jug1 = new Jugador();
		jug1.correr();
		Persona jugP = jug1;
		jugP.correr();
		
		
		
		jug1.setNombre("Antonio");
		jug1.setDorsal(10);
		jug1.setPosition("Delantero");
		// crear jugador2
		Jugador jug2 = new Jugador("Juan", 12, "Defensa");
		
		//localizar el fichero(donde, como se llamara)
		File f = new File(System.getProperty("user.dir")+File.separator+"files/input.txt");
		
		// leer el fichero, linea a linea
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
				
		String miLinea = br.readLine();
		//Juan,01,Portero
		
		while(miLinea != null) {
			//System.out.println(miLinea);
			String[] partes = miLinea.split(",");
			//partes[0]-juan
			//partes[1]-01
			//partes[2]-portero
			String nombre="";
			int dorsal=0;
			String position="";
			
			for (int i = 0; i < partes.length; i++) {
				
				switch (i) {
				case 0:
					nombre = partes[1];
					break;
				case 1:
					dorsal = Integer.parseInt(partes[i]);
					break;
				case 2:
					 position = partes[i];
					break;

				default:
					break;
				}
			}
			Jugador jug3 = new Jugador(nombre, dorsal, position);
			jugadores.add(jug3);
			
			
			miLinea = br.readLine();
		}
		fr.close();
		br.close();	
		
		System.out.println(jugadores.toString());
		
		// por cada linea, crear un jugador
		
		
		
		
		// from Array[] to ArrayList<>
		// 1. definir array tamaño
		//Jugador[] jugadores = new Jugador[MAX_NUMERO_JUGADORES];
		ArrayList<Jugador> jugadores =new ArrayList<Jugador>();
		
		// 2. almacenar en array		
//		jugadores[numeroJugadores] = jug1;
//		numeroJugadores++;
		jugadores.add(jug1);		
//		jugadores[numeroJugadores] = jug2;
//		numeroJugadores++;
		jugadores.add(jug2);
		
		//3. leer array
//		for (int i = 0; i < jugadores.length; i++) {
//			System.out.println(jugadores[i]);//			
//		}		
		for (int i = 0; i < jugadores.size(); i++) {
			System.out.println(jugadores.get(i));
		}
		
		//String
		System.out.println("STRING == y EQUALS");
		String equipo1 = "Chelsea";
		String equipo2 = "Chelsea";
		String equipo3  = new String("Chelsea");
		
		if (equipo1==equipo2) {
			System.out.println("1 y 2 iguales con = ");
		} else {
			System.out.println("1 y 2 diferentes con  = ");

		}
		
		if (equipo1.equals(equipo2)) {
			System.out.println("1 y 2 iguales con equals ");
		} else {
			System.out.println("1 y 2 diferentes con  equals ");

		}
		
		if (equipo1==equipo3) {
			System.out.println("1 y 3 iguales con = ");
		} else {
			System.out.println("1 y 3 diferentes con  = ");

		}
		
		if (equipo1.equals(equipo3)) {
			System.out.println("1 y 3 iguales con equals ");
		} else {
			System.out.println("1 y 3 diferentes con  equals ");

		}
		
		System.out.println("STRING INMUTABLE");
		equipo1.toUpperCase();
		System.out.println(equipo1);
		
		System.out.println("STRING METODOS");
//		Chelsea
		equipo1.length();
		equipo1.charAt(1);
		equipo1.indexOf("h");
		equipo1.substring(3);
		equipo1.toLowerCase();
		equipo1.toUpperCase();
		equipo1.equals(equipo3);
		equipo1.startsWith("C");
		equipo1.endsWith("a");
		equipo1.contains("hel");
		equipo1.replace('h', 'x');
		equipo1.trim();
		equipo1.concat(equipo2);
		
		System.out.println("STRINGBUILDER MUTABLE");
		StringBuilder equipoB = new StringBuilder("Chelsea");
		equipoB.append("sufijo");
		System.out.println(equipoB);
		
		
		System.out.println("STRINGBUILDER METODOS");
		equipoB.append("sufijo");
		equipoB.insert(2,"new");
		equipoB.delete(1,3);
		equipoB.delete(2, 4);
		equipoB.reverse();
		
		System.out.println("WRAPPER");
		int edad1 = jug1.getEdad();
		//edad1.
		
		Integer edad2 = jug1.getEdad();
		//edad2.
		
		
		
		
		// ejemplo static modificador
		// static attribute
//		System.out.println(jug1.getGenero());
//		System.out.println(jug2.getGenero());
		Jugador.setGenero("femenino");		
//		System.out.println(jug1.getGenero());
//		System.out.println(jug2.getGenero());
		//static method
		jugar("ofensivo");		
		Equipo equipo = new Equipo();
		equipo.presionar();
		
		// modificadores
		//
		
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
