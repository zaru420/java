package instituto;

public class instituto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoCrud a=new AlumnoCrud();
		Alumno benito = new Alumno ("48866994H", "Benito","Camela", "BenitoCamela", "Ninguna1234", "foto_Benito.jpg", "Calle de la fiesta 69,2izq", "6525896324", 2, true);
		Alumno benito2 = new Alumno (29, "48866994H", "Benito","Camela", "BenitoCamela", "Ninguna1234", "foto_Benito.jpg", "Calle de la fiesta 69,2izq", "6525896324", 2, true);
		
											//Consultas!!
												  
		
		//a.leerAlumno(3); // Llamar al metodo leerAlumno() en esa instancia, pasando el argumento como objeto de AlumnoCrud
		//a.crearAlumno(benito); // Llamar al método crearAlumno() en esa instancia, pasando como argumento el objeto AlumnoCrud
		//a.borrarAlumno(28);// Llamar al método borrarAlumno() en esta instancia, pasando como argumento del objeto borrarCrud
		//a.actualizarAlumno(benito2);// Llamar al metodo actualizarAlumno() en esa instancia, pasando el argumento como objeto de AlumnoCrud
	}
	

}
