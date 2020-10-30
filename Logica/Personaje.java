package Logica;

public class Personaje extends Entidad {
	
	private int cargaViral;

	public Personaje(int x, int y) {
		super(x, y);
		cargaViral=0;
		// TODO Auto-generated constructor stub
	}
	
	public int getCargaViral() {
		return cargaViral;
	}

	public void aumentarCargaViral(int carga) {
		cargaViral+=carga;
	}
	
	public void desinfectar(Entidad e) {
		//e.recibirCura(10);
	}
}
