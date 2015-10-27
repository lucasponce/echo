package org.hawkular.test;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class EchoResource {

    @POST
    public void post(String payload) {
        System.out.println("POST ");
        System.out.println(payload);
    }
}