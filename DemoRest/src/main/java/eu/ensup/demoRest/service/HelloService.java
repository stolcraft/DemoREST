package eu.ensup.demoRest.service;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		String output = "Jersey repond via OBJIS : " + msg;
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/")
	public Response getMsg2() {
		String output = "Bienvenue à l'accueil ";
		return Response.status(200).entity(output).build();
	}

}
