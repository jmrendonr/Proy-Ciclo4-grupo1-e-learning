
package restful.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import restful.Model.EstudiantesModel;
import restful.Model.Conexion;

public class EstudiantesService {
    
    public ArrayList<EstudiantesModel> getEstudiantes() {
        ArrayList<EstudiantesModel> lista = new ArrayList<>();
        Conexion conn = new Conexion();
        String sql = "SELECT * FROM estudiantes";

        try {
            Statement stm = conn.getCon().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                EstudiantesModel estudiantes = new EstudiantesModel();
                estudiantes.setCod_estudiante(rs.getInt("cod_estudiante"));
                estudiantes.setId_estudiante(rs.getFloat("id_estudiante"));
                estudiantes.setNombre_estudiante(rs.getString("nombre_estudiante"));
                estudiantes.setApellido_estudiante(rs.getString("apellido_estudiante"));
                estudiantes.setEmail_estudiante(rs.getString("email_estudiante"));
                estudiantes.setTelefono_estudiante(rs.getFloat("telefono_estudiante"));
                estudiantes.setPais_estudiante(rs.getString("pais_estudiante"));
                estudiantes.setCurso_estudiante(rs.getString("curso_estudiante"));
                
                lista.add(estudiantes);
                
            }
        } catch (SQLException e) {
        }

        return lista;
    }

public EstudiantesModel getEstudiantes(int cod_estudiante) {
        EstudiantesModel estudiantes = new EstudiantesModel();
        Conexion conex = new Conexion();
        String Sql = "SELECT * FROM estudiantes WHERE cod_estudiante = ?";

        try {

            PreparedStatement pstm = conex.getCon().prepareStatement(Sql);
            pstm.setInt(1, cod_estudiante);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                estudiantes.setCod_estudiante(rs.getInt("cod_estudiante"));
                estudiantes.setId_estudiante(rs.getFloat("id_estudiante"));
                estudiantes.setNombre_estudiante(rs.getString("nombre_estudiante"));
                estudiantes.setApellido_estudiante(rs.getString("apellido_estudiante"));
                estudiantes.setEmail_estudiante(rs.getString("email_estudiante"));
                estudiantes.setTelefono_estudiante(rs.getFloat("telefono_estudiante"));
                estudiantes.setPais_estudiante(rs.getString("pais_estudiante"));
                estudiantes.setCurso_estudiante(rs.getString("curso_estudiante"));
                                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return estudiantes;
    }

public EstudiantesModel addEstudiantes(EstudiantesModel estudiantes) {
        Conexion conex = new Conexion();
        String Sql = "INSERT INTO estudiantes(cod_estudiante,id_estudiante,nombre_estudiante,apellido_estudiante,email_estudiante,telefono_estudiante,pais_estudiante,curso_estudiante)";
        Sql = Sql + "values (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pstm = conex.getCon().prepareStatement(Sql);
            pstm.setInt(1, estudiantes.getCod_estudiante());
            pstm.setFloat(2, estudiantes.getId_estudiante());
            pstm.setString(3, estudiantes.getNombre_estudiante());
            pstm.setString(4, estudiantes.getApellido_estudiante());
            pstm.setString(5, estudiantes.getEmail_estudiante());
            pstm.setFloat(6, estudiantes.getTelefono_estudiante());
            pstm.setString(7, estudiantes.getPais_estudiante());
            pstm.setString(8, estudiantes.getCurso_estudiante());
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        return estudiantes;
    }

public EstudiantesModel updateEstudiantes(EstudiantesModel estudiantes) {
        Conexion conn = new Conexion();
        String sql = "UPDATE estudiantes SET nombre_estudiante = ?,apellido_estudiante = ?,email_estudiante = ?,telefono_estudiante = ?,pais_estudiante = ?,curso_estudiante = ? WHERE id_estudiante = ?,";
        
        try {
            PreparedStatement pstm = conn.getCon().prepareStatement(sql);
            pstm.setFloat(1, estudiantes.getId_estudiante());
            pstm.setString(2, estudiantes.getNombre_estudiante());
            pstm.setString(3, estudiantes.getApellido_estudiante());
            pstm.setString(4, estudiantes.getEmail_estudiante());
            pstm.setFloat(5, estudiantes.getTelefono_estudiante());
            pstm.setString(6, estudiantes.getPais_estudiante());
            pstm.setString(7, estudiantes.getCurso_estudiante());
            pstm.setInt(8, estudiantes.getCod_estudiante());
            pstm.executeUpdate();
            
        } catch (SQLException excepcion) {
            System.out.println("Ha ocurrido un error al eliminar  " + excepcion.getMessage());
            return null;
        }
        
        
        return estudiantes;
        
    }

public String delEstudiantes(int cod_estudiante) {
        Conexion conn = new Conexion();

        String sql = "DELETE FROM estudiantes WHERE cod_estudiante= ?";
        try {
            PreparedStatement pstm = conn.getCon().prepareStatement(sql);
            pstm.setInt(1, cod_estudiante);
            pstm.executeUpdate();
            
        } catch (SQLException excepcion) {
            System.out.println("Ha ocurrido un error al eliminar  " + excepcion.getMessage());
            return "{\"Accion\":\"Error\"}";
            
        }
        
        return "{\"Accion\":\"Registro Borrado\"}";
    }

}

