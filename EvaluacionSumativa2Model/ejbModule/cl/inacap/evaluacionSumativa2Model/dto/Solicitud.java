package cl.inacap.evaluacionSumativa2Model.dto;

public class Solicitud {
	private int numeroSolicitud;
	private String rut;
	private String nombreCliente;
	private int tipo;

	public Solicitud(int numeroSolicitud, String rut, String nombreCliente, int tipo) {
		super();
		this.numeroSolicitud = numeroSolicitud;
		this.rut = rut;
		this.nombreCliente = nombreCliente;
		this.tipo = tipo;
	}

	public int getNumeroSolicitud() {
		return numeroSolicitud;
	}

	public String getRut() {
		return rut;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public int getTipo() {
		return tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroSolicitud;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Solicitud other = (Solicitud) obj;
		if (numeroSolicitud != other.numeroSolicitud)
			return false;
		return true;
	}
	
	
}
