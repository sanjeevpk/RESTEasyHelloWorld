package com.sanjeev.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;


@Path("/hello")
@Component
public class GreetingResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProduct(){
		return Response.ok("Hello from REST web services!").build();
	}
}
