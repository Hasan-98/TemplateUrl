/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TemplateUrl.TemplateUrl.Controller;

import ch.qos.logback.core.CoreConstants;
import org.springframework.web.bind.annotation.RestController;
import com.TemplateUrl.TemplateUrl.Repository.*;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Kalsym
 */
@RestController
@RequestMapping("/api/")
public class TemplateUrlController {

    @Autowired
    private TemplateUrlRepository templateUrlRepository;

   

    @RequestMapping("/local/1")
    public RedirectView Store_Front() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:4200");
        return redirectView;
    }

    @RequestMapping("/local/2")
    public RedirectView Store_front_x() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:54934");
        return redirectView;
    }
    
     @RequestMapping("/local/3")
    public RedirectView Store_Front_Organic() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:3200");
        return redirectView;
    }

}
