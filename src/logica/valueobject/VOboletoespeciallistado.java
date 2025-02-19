package logica.valueobject;

public class VOboletoespeciallistado extends VOboletoespecialingreso{
	
	private int numero;
	
	private float monto;

	public VOboletoespeciallistado(String nombrepasajero, int edad, String celular, int numero, float monto) {
		super(nombrepasajero, edad, celular);
		this.numero = numero;
		this.monto = monto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}
				
}
