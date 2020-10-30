package Logica;

import java.util.LinkedList;

import GUI.GUI;

public class Juego {

	public GUI gui;
	public LinkedList<Entidad> listaEntidades;
	public Mapa mapa;
	
	public Juego(GUI gui) {
		this.gui=gui;
		listaEntidades= new LinkedList();
	}
	
	public void agregarEntidad(Entidad entidad, int x, int y) {

	}
}
