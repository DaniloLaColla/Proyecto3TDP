package Logica;

import javax.swing.ImageIcon;

public class Beta extends Enemigo {

	public Beta(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BetaCaminaGif.gif")));
	}

	public void mover() {
        super.mover();
        label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BetaCaminaGif.gif")));
    }

    public void atacar(Entidad e) {
        label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BetaAtacaGif.gif")));
    }

    public void parar() {
        label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BetaParado.png")));
    }

}
