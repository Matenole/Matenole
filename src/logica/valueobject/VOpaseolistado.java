package logica.valueobject;

public class VOpaseolistado extends VOpaseoingreso{
		
		private float monto;

		public  VOpaseolistado(String codigo, String destino, time horasalida, time horallegada, float precio,
				int maxboletos, float monto) {
			super(codigo, destino, horasalida, horallegada, precio, maxboletos);
			this.monto = monto;
		}

		public float getMonto() {
			return monto;
		}

		public void setMonto(float monto) {
			this.monto = monto;
		}
	
}
