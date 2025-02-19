package logica.negocio;
import java.time.*;

public class paseo {
		
		private String Codigo;
		
		private String Destino;
		
		private LocalTime Horasalida;
		
		private LocalTime Horallegada;
		
		private float precio;
		
		private int maxboletos;

		public paseo(String codigo, String destino, LocalTime horasalida, LocalTime horallegada, float precio, int maxboletos) {
			super();
			Codigo = codigo;
			Destino = destino;
			Horasalida = horasalida;
			Horallegada = horallegada;
			this.precio = precio;
			this.maxboletos = maxboletos;
		}

		public String getCodigo() {
			return Codigo;
		}

		public void setCodigo(String codigo) {
			Codigo = codigo;
		}

		public String getDestino() {
			return Destino;
		}

		public void setDestino(String destino) {
			Destino = destino;
		}

		public LocalTime getHorasalida() {
			return Horasalida;
		}

		public void setHorasalida(LocalTime horasalida) {
			Horasalida = horasalida;
		}

		public LocalTime getHorallegada() {
			return Horallegada;
		}

		public void setHorallegada(LocalTime horallegada) {
			Horallegada = horallegada;
		}

		public float getPrecio() {
			return precio;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}

		public int getMaxboletos() {
			return maxboletos;
		}

		public void setMaxboletos(int maxboletos) {
			this.maxboletos = maxboletos;
		}
		
			

}
