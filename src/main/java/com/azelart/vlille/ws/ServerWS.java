package com.azelart.vlille.ws;

import com.azelart.vlille.dto.ServerDTO;
import com.azelart.vlille.services.VLilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * Server WS.
 * @author Corentin Azelart
 */
@Path("server")
@Component
public class ServerWS {

    /**
     * VLille Service to access Hazelcast.
     */
    @Autowired
    private VLilleService vLilleService;

    /**
     * Perform a who.
     * @param httpServletRequest is the HTTP Servlet Request
     * @return a string with ip and port
     */
    @GET
    @Path("who")
    @Produces(MediaType.APPLICATION_JSON)
    public ServerDTO who(@Context HttpServletRequest httpServletRequest) {
        final ServerDTO server = vLilleService.getCacheStatus();
        server.setName(httpServletRequest.getServerName());
        server.setPort(httpServletRequest.getServerPort());
        return server;
    }


}
