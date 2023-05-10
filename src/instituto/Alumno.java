package instituto;


public class Alumno {
		
		//ATRIBUTOS
		private int id;
		private String DNI;
		private String nombre;
		private String apellidos;
		private String usuario;
		private String contraseña;
		private String foto;
		private String direccion;
		private String telefono;
		private int tipo_usuario;
		private boolean activo;
		
		
																	//	CONSTRUCTOR
		
									//sin ID
		
		public Alumno( String DNI, String nombre, String apellidos, String usuario, String contraseña,String foto,String direccion,String telefono,int tipo_usuario,boolean activo) {
			 this.DNI=DNI;
			 this.nombre= nombre;
			 this.apellidos= apellidos;
			 this.usuario= usuario;
			 this.contraseña= contraseña;
			 this.foto= foto;
			 this.direccion= direccion;
			 this.telefono=telefono;
			 this.tipo_usuario= tipo_usuario;
			 this.activo= activo;
			 System.out.println("Ejecutamos el constructor por defecto");
		}
		
		
		
		 public Alumno(int id, String DNI, String nombre, String apellidos, String usuario, String contraseña,String foto,String direccion,String telefono,int tipo_usuario,boolean activo) {
			 this.id= id;
			 this.DNI= DNI;
			 this.nombre= nombre;
			 this.apellidos= apellidos;
			 this.usuario= usuario;
			 this.contraseña= contraseña;
			 this.foto= foto;
			 this.direccion= direccion;
			 this.telefono=telefono;
			 this.tipo_usuario= tipo_usuario;
			 this.activo= activo;
			 System.out.println("Ejecutamos el constructor por defecto");
			
		 }
		 					//solo los imprescindibles
		 public Alumno(int id,String nombre, String apellidos,String usuario, String contraseña, String foto, String direccion, int tipo_usuario,boolean activo ) {
			 this.id= id;
			 this.nombre= nombre;
			 this.apellidos= apellidos;
			 this.usuario= usuario;
			 this.contraseña= contraseña;
			 this.tipo_usuario= tipo_usuario;
			 this.activo= activo;
			 System.out.println("Ejecutamos el constructor con todos los parametros");
			
		 }
		 					// ahora los que no son imprescindibles
		 public Alumno (String foto,String direccion, String telefono) {
			 this.foto= foto;
			 this.direccion= direccion;
			 this.telefono=telefono;
			 System.out.println("Ejecutamos el constructor con solo dos parametros");
			
		 }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDNI() {
			return DNI;
		}
		public void setDNI(String dNI) {
			DNI = dNI;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellidos;
		}
		public void setApellido(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getContraseña() {
			return contraseña;
		}
		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}
		public String getFoto() {
			return foto;
		}
		public void setFoto(String foto) {
			this.foto = foto;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public int getTipo_usuario() {
			return tipo_usuario;
		}
		public void setTipo_usuario(int tipo_usuario) {
			this.tipo_usuario = tipo_usuario;
		}
		public boolean isActivo() {
			return activo;
		}
		public void setActivo(boolean activo) {
			this.activo = activo;
		}
		@Override
		public String toString() {
			return "Alumno [id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", usuario="
					+ usuario + ", contraseña=" + contraseña + ", foto=" + foto + ", direccion=" + direccion
					+ ", telefono=" + telefono + ", tipo_usuario=" + tipo_usuario + ", activo=" + activo + "]";
		}
		
		 
}