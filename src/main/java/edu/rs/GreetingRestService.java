package edu.rs;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
@Path("/greeting")
public class GreetingRestService extends Application {

    @GET
    @Path("/{name}")
    public String greet(@PathParam("name") String name){
        return "Hello " + name;
    }

}
