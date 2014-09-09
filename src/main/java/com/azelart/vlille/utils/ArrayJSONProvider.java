package com.azelart.vlille.utils;

import com.azelart.vlille.dto.StationDTO;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.api.json.JSONJAXBContext;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.stream.StreamSource;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.*;
import javax.xml.bind.*;

/**
 * JSON Provider for array.
 * @author Corentin Azelart
 */
@Provider
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArrayJSONProvider implements ContextResolver<JAXBContext> {

    private JAXBContext context;

    private Class<?>[] types = { StationDTO.class };

    private List<Class<?>> classes = new ArrayList<Class<?>>();

    public ArrayJSONProvider() throws Exception {
        this.context = new JSONJAXBContext(JSONConfiguration.natural().build(), types);

        for (Class<?> clazz : types) {
            classes.add(clazz);
        }
    }

    public JAXBContext getContext(Class<?> objectType) {
        return classes.contains(objectType) ? context : null;
    }

}