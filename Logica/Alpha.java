package Logica;

import javax.swing.ImageIcon;

public class Alpha extends Enemigo {

	public Alpha(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AlfaCaminaGif.gif")));
		// TODO Auto-generated constructor stub
	}
	
	public void mover() {
        super.mover();
        label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AlfaCaminaGif.gif")));
    }

    public void atacar(Entidad e) {
        label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AlfaAtacaGif.gif")));
    }

    public void parar() {
        label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AlfaParado.png")));
    }

}
