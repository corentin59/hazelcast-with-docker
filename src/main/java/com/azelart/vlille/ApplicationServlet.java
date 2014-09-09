package com.azelart.vlille;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created with IntelliJ IDEA.
 * User: CAZELART
 * Date: 02/09/14
 * Time: 16:28
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationServlet extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
