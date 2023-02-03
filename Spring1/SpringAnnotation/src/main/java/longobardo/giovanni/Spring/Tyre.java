package longobardo.giovanni.Spring;

public class Tyre { // Significa pneumatico :P

	private String marca;

	
	
	public Tyre(String marca) {
	super();
	this.marca = marca;
}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Tyre [marca=" + marca + "]";
	}
	
	
}
