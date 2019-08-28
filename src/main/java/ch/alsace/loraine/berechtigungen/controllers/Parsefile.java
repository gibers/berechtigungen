package ch.alsace.loraine.berechtigungen.controllers;

import ch.alsace.loraine.berechtigungen.implementation.ParseFileImpl;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;


@RestController
@Log
public class Parsefile {

//    Logger logger = LoggerFactory.getLogger(Parsefile.class);


    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private ParseFileImpl parseFileImpl;

    @GetMapping(path = "/parsefile")
    public String parsefile() {

        log.fine("A TRACE Message");
        log.log(Level.FINER, "log Finer");
        log.log(Level.FINE, "log Fine");
        log.log(Level.INFO, "log Info");
        log.log(Level.WARNING , "log Warning");
        log.log(Level.SEVERE , "log Severe");


        String toto = parseFileImpl.toto();
        return "Greetings from Spring Boot! " + toto + " -- " + applicationName ;
    }

}
