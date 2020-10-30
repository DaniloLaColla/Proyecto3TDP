package Logica;

import java.awt.Point;

import javax.swing.JLabel;

public abstract class Entidad  {

	protected JLabel label;
	protected int cargaViral;
	
		public Entidad(int x, int y) {
		label= new JLabel();
		setPosicion(x,y);
		
	}
	
	public void setPosicion(int x, int y) {
		label.setLocation(x, y);
	}
	
	
	public Point getPosicion() {
		return label.getLocation();
	}
	
	public int getCargaViral() {
		return cargaViral;
	}

	public void setCargaViral(int cargaViral) {
		this.cargaViral = cargaViral;
	}

	public void recibirCura(int cura) {
		
	}
}
