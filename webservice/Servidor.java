package webservice;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class Servidor {
    public static void main(String[] args) {
        URI endpoint =  UriBuilder.fromUri("http://localhost/").port(9000).build();
        ResourceConfig calculadora_rc = new PackagesResourceConfig("webservice");
        try{
            HttpServer server =     HttpServerFactory.create(endpoint, calculadora_rc);     server.start();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
