package com.freighthero

import org.jboss.resteasy.reactive.RestResponse
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() = RestResponse.ResponseBuilder.ok(mutableListOf("apples")).build()
}