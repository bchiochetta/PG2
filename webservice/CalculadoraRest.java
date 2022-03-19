package webservice;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/calculadora")
public class CalculadoraRest {

    @Produces(MediaType.APPLICATION_JSON)
    @Path("/somarInt/{a}/{b}")
    @GET
    public Calculadora somarInt(@PathParam("a") int a, @PathParam("b") int b) {
        return new Calculadora(a,b, "+");
    }

    @Produces(MediaType.APPLICATION_JSON)
    @Path("/multiplicarInt/{a}/{b}")
    @GET
    public Calculadora multiplicarInt(@PathParam("a") int a, @PathParam("b") int b) {
        return new Calculadora(a,b, "*");
    }

}
