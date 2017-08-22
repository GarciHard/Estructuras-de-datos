package colaprioridad;

public class DatosUsuario{
	/*Variables declaradas del tipo privado para que no sean 
	 * modificadas fuera de la misma clase*/
	private String usuario, nombreDoc;
	private int prioridad, hora, minutos, segundos;
	
	public DatosUsuario(){
		/*Constructor por defecto
        * ya que no será necesario utilizar
        * un constructor por parametros, porque los
        * datos los asignaremos por separado con sus metodos
        * de acceso get() y set()*/
	}
	
	/*Encapsulamiento de datos para ingresar y regresar datos*/
	public void setUsuario(String usuario){
		this.usuario = usuario;
	}
	public String getUsuario(){
		return usuario;
	}
	public void setNombreDoc(String nombreDoc){
		this.nombreDoc = nombreDoc;
	}
	public String getNombreDoc(){
		return nombreDoc;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
}