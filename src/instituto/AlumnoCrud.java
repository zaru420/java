package instituto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AlumnoCrud {

	
	
    //Método para crear un nuevo alumno
    public void crearAlumno(Alumno alumno) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // Establecer conexión con la base de datos
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/instituto", "admin006", "Ninguna1234");
            
            
            // Sentencia SQL de inserción
            String sql = "INSERT INTO usuarios (DNI, nombre, apellidos, usuario, contraseña, foto, direccion, telefono, tipo_usuario, activo) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            pstmt = conn.prepareStatement(sql);
            
            // Asignar valores a los parámetros de la sentencia SQL
            pstmt.setString(1, alumno.getDNI());
            pstmt.setString(2, alumno.getNombre());
            pstmt.setString(3, alumno.getApellido());
            pstmt.setString(4, alumno.getUsuario());
            pstmt.setString(5, alumno.getContraseña());
            pstmt.setString(6, alumno.getFoto());
            pstmt.setString(7, alumno.getDireccion());
            pstmt.setString(8, alumno.getTelefono());
            pstmt.setInt(9, alumno.getTipo_usuario());
            pstmt.setBoolean(10, alumno.isActivo());
            
            // Ejecutar la sentencia SQL de inserción
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    
    
    
    
    
    
    // Método para leer un alumno por su id
    public Alumno leerAlumno(int id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Alumno alumno = null;
        try {
            // Establecer conexión con la base de datos
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/instituto", "admin006", "Ninguna1234");
            
            // Sentencia SQL de selección
            String sql = "SELECT * FROM usuarios WHERE id = ?";
            
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            
            // Ejecutar la sentencia SQL de selección
            rs = pstmt.executeQuery();
            
            // Recorrer el resultado y crear el objeto Alumno correspondiente
            if (rs.next()) {
                alumno = new Alumno(rs.getInt("id"), rs.getString("DNI"), rs.getString("nombre"), rs.getString("apellidos"), 
                                    rs.getString("usuario"), rs.getString("contraseña"), rs.getString("foto"), rs.getString("direccion"), 
                                    rs.getString("telefono"), rs.getInt("tipo_usuario"), rs.getBoolean("activo"));
                System.out.println(alumno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return alumno;
    }

    
    
    
    
    
    
  //Método para borrar un alumno existente
    public void borrarAlumno(int id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // Establecer conexión con la base de datos
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/instituto", "admin006", "Ninguna1234");
            
            // Sentencia SQL de eliminación
            String sql = "DELETE FROM usuarios WHERE id = ?";
            
            pstmt = conn.prepareStatement(sql);
            
            // Asignar valor al parámetro de la sentencia SQL
            pstmt.setInt(1, id);
            
            // Ejecutar la sentencia SQL de eliminación
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
    

 // Método para actualizar un alumno existente
    public void actualizarAlumno(Alumno alumno) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // Establecer conexión con la base de datos
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/instituto", "admin006", "Ninguna1234");
            
            // Sentencia SQL de actualización
            String sql = "UPDATE usuarios SET DNI = ?, nombre = ?, apellidos = ?, usuario = ?, contraseña = ?, foto = ?, direccion = ?, telefono = ?, tipo_usuario = ?, activo = ? WHERE id = ?";
            
            pstmt = conn.prepareStatement(sql);
            
            // Asignar valores a los parámetros de la sentencia SQL
            pstmt.setString(1, alumno.getDNI());
            pstmt.setString(2, alumno.getNombre());
            pstmt.setString(3, alumno.getApellido());
            pstmt.setString(4, alumno.getUsuario());
            pstmt.setString(5, alumno.getContraseña());
            pstmt.setString(6, alumno.getFoto());
            pstmt.setString(7, alumno.getDireccion());
            pstmt.setString(8, alumno.getTelefono());
            pstmt.setInt(9, alumno.getTipo_usuario());
            pstmt.setBoolean(10, alumno.isActivo());
            pstmt.setInt(11, alumno.getId());

            // Ejecutar la sentencia SQL de actualización
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}





