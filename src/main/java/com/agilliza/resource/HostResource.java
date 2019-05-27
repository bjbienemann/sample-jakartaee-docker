package com.agilliza.resource;

import com.agilliza.domain.HostDomain;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Path("host")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HostResource {

    @GET
    public HostDomain getHost() throws UnknownHostException {
        return new HostDomain(InetAddress.getLocalHost());
    }
}
