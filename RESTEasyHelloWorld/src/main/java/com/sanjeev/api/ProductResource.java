package com.sanjeev.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sanjeev.model.Product;

@Path("/products")
public class ProductResource {
	
private static List<Product> productList = new ArrayList<Product>();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllProducts(){
		productList.add(new Product("Mobiles", "1", 10000));
		productList.add(new Product("Tablets", "2", 5000));
		productList.add(new Product("Laptops", "3", 25000));
		return Response.ok(productList).build();
	}
}
