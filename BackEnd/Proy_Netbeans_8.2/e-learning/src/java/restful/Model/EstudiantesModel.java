
package restful.Model;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class EstudiantesModel {
    private int cod_estudiante;
    private float id_estudiante;
    private String nombre_estudiante;
    private String apellido_estudiante;
    private String email_estudiante;
    private float telefono_estudiante;
    private String pais_estudiante;
    private String curso_estudiante;

    public EstudiantesModel() {
    }

    public EstudiantesModel(int cod_estudiante, float id_estudiante, String nombre_estudiante, String apellido_estudiante, String email_estudiante, float telefono_estudiante, String pais_estudiante, String curso_estudiante) {
        this.cod_estudiante = cod_estudiante;
        this.id_estudiante = id_estudiante;
        this.nombre_estudiante = nombre_estudiante;
        this.apellido_estudiante = apellido_estudiante;
        this.email_estudiante = email_estudiante;
        this.telefono_estudiante = telefono_estudiante;
        this.pais_estudiante = pais_estudiante;
        this.curso_estudiante = curso_estudiante;
    }

    public int getCod_estudiante() {
        return cod_estudiante;
    }

    public void setCod_estudiante(int cod_estudiante) {
        this.cod_estudiante = cod_estudiante;
    }

    public float getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(float id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public String getApellido_estudiante() {
        return apellido_estudiante;
    }

    public void setApellido_estudiante(String apellido_estudiante) {
        this.apellido_estudiante = apellido_estudiante;
    }

    public String getEmail_estudiante() {
        return email_estudiante;
    }

    public void setEmail_estudiante(String email_estudiante) {
        this.email_estudiante = email_estudiante;
    }

    public float getTelefono_estudiante() {
        return telefono_estudiante;
    }

    public void setTelefono_estudiante(float telefono_estudiante) {
        this.telefono_estudiante = telefono_estudiante;
    }

    public String getPais_estudiante() {
        return pais_estudiante;
    }

    public void setPais_estudiante(String pais_estudiante) {
        this.pais_estudiante = pais_estudiante;
    }

    public String getCurso_estudiante() {
        return curso_estudiante;
    }

    public void setCurso_estudiante(String curso_estudiante) {
        this.curso_estudiante = curso_estudiante;
    }
            
}
