package com.azelart.vlille.dto;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Exception DTO.
 * @author Corentin Azelart
 */
public class ExceptionDTO extends WebApplicationException {

    /**
     * Default constructor.
     * @param message is the exception message.
     */
    public ExceptionDTO(final String message) {
        super(Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity("{error : \"" + message + "\"}").type(MediaType.APPLICATION_JSON).build());
    }
}
