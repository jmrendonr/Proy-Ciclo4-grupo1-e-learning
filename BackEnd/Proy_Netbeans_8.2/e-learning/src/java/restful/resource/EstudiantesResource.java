
package restful.resource;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import restful.Model.EstudiantesModel;
import restful.service.EstudiantesService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

@Path("estudiantes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstudiantesResource {

    EstudiantesService servicio = new EstudiantesService();
    
    @GET
    public ArrayList<EstudiantesModel> getEstudiantes() {

        return servicio.getEstudiantes();
    }
    
    @Path("/{EstudianteCod}")
    @GET
    public EstudiantesModel getEstudiantes(@PathParam("EstudianteCod") int cod_estudiante) {

        return servicio.getEstudiantes(cod_estudiante);
    }
    
    @POST
    public EstudiantesModel addEstudiantes(String JSON) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        EstudiantesModel estudiantes = gson.fromJson(JSON, EstudiantesModel.class);
        return servicio.addEstudiantes(estudiantes);
    }
    
    @DELETE
    @Path("/{EstudianteCod}")
    public String delEstudiantes(@PathParam("EstudianteCod") int cod_estudiante) {

        return servicio.delEstudiantes(cod_estudiante);

    }
    
    @PUT
    public EstudiantesModel updateEstudiantes(String JSON) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        EstudiantesModel estudiantes = gson.fromJson(JSON, EstudiantesModel.class);
        return servicio.updateEstudiantes(estudiantes);
    }
    
}

