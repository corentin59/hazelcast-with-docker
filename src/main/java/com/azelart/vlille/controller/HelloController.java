package com.azelart.vlille.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Main Web Application.
 * author Corentin Azelart
 */
@Controller
public class HelloController {

    /**
     * Catch root web path.
     * @return a template name
     */
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index() {
        return "index";
    }
}