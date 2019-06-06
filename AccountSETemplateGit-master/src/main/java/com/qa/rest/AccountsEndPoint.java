package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.business.service.AccountService;
import com.qa.business.service.AccountServiceImpl;



@Path("/account")
public class AccountsEndPoint {
	
	@Inject
	private AccountService service;

	@Path("/getAllAccounts")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return service.getAllAccounts();
	}
	
	
	
	
	
	
//	@Path("/cycleMovies/{title}")
//	@GET
//	@Produces({ "application/json" })
//	public int cycleMovies(@PathParam("title") String title) {
//		return service.cycleMovies(title);
//	}
//	
//	@Path("/getAMovie/{id}")
//	@GET
//	@Produces({ "application/json" })
//	public String getAMovie(@PathParam("id") Long id) {
//		return service.getAMovie(id);
//	}
//
//	@Path("/createMovie")
//	@POST
//	@Produces({ "application/json" })
//	public String addMovie(String movie) {
//		return service.addMovie(movie);
//	}
//
//	@Path("/deleteMovie/{id}")
//	@DELETE
//	@Produces({ "application/json" })
//	public String deleteMovie(@PathParam("id") Long id) {
//		return service.deleteMovie(id);
//	}
//
//	public void setService(MovieService service) {
//		this.service = service;
//	}

}
