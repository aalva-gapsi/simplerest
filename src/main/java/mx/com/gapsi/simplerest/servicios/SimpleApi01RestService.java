package mx.com.gapsi.simplerest.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.gapsi.simplerest.modelos.Objeto01;
import mx.com.gapsi.simplerest.modelos.SubObjeto01;

@ApplicationPath("rest")
@Path("objetos")
public class SimpleApi01RestService extends Application {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarObjetos() {
		SubObjeto01 subObjeto01 = new SubObjeto01("propSub1");
		Objeto01 objeto01 = new Objeto01("d290f1ee-6c54-4b01-90e6-d701748f0851", "prop1", "21", subObjeto01);
		
		SubObjeto01 subObjeto02 = new SubObjeto01("propSub2");
		Objeto01 objeto02 = new Objeto01("d290f1ee-6c54-4b01-90e6-d701748f0877", "prop2", "22", subObjeto02);
		
		SubObjeto01 subObjeto03 = new SubObjeto01("propSub3");
		Objeto01 objeto03 = new Objeto01("d290f1ee-6c54-4b01-90e6-d701748f0888", "prop3", "33", subObjeto03);
		
		List<Objeto01> listaObjetos01 = new ArrayList<Objeto01>();
		listaObjetos01.add(objeto01);
		listaObjetos01.add(objeto02);
		listaObjetos01.add(objeto03);
		
		return Response.status(Response.Status.OK).entity(listaObjetos01).build();
	}

	@GET
	@Path("objeto01/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarObjetos(@PathParam("id") String id) {
		SubObjeto01 subObjeto01 = new SubObjeto01("propSub1");
		Objeto01 objeto01 = new Objeto01(id, "prop1", "21", subObjeto01);
		return Response.status(Response.Status.OK).entity(objeto01).build();
	}

	@POST
	@Path("objeto01")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response crearObjeto01(Objeto01 objeto01) {
		System.out.println(objeto01.getId());
		System.out.println(objeto01.getPropiedadInt());
		System.out.println(objeto01.getPropiedadString());
		System.out.println(objeto01.getSubObjeto01().getPropiedadString());
		return Response.status(Response.Status.CREATED).entity(objeto01).build();
	}

	@DELETE
	@Path("objeto01/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response eliminarObjeto01(@PathParam("id") String id) {
		Objeto01 objeto01 = new Objeto01(id,null,null,null);
		return Response.status(Response.Status.OK).entity(objeto01).build();
	}
}
