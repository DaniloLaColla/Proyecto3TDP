package Logica;

public abstract class Enemigo extends Entidad{

	protected int velocidad;
	protected Strategy estrategia;
	
	public Enemigo(int x, int y) {
		super(x, y);
		velocidad=100;
		// TODO Auto-generated constructor stub
	}

	public void mover() {
        this.setPosicion(this.getPosicion().x - velocidad, this.getPosicion().y);
    }

    public void parar() {
        this.setPosicion(this.getPosicion().x,  this.getPosicion().y);
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void recibirCura(int cura) {
    	cargaViral-=cura;
    }
	
}
