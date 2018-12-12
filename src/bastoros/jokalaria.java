package bastoros;

public class jokalaria {

	private int id;
	private String izena;
	private int rol;

	jokalaria(int id, String izena, int rol) {
		this.id = id;
		this.izena = izena;
		this.rol = rol;
	}

	// GET
	public int getId() {
		return id;
	}

	public int getRol() {
		return rol;
	}

	public String getIzena() {
		return izena;
	}
	// #

	// SET
	public void setRol() {
		this.rol = 1;
	}
	// #
}