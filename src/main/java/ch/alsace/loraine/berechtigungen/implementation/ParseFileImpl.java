package ch.alsace.loraine.berechtigungen.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ParseFileImpl {

    @Value("${toto.fichier.path}")
    private String chemin;

    @Value("${spring.application.name}")
    private String applicationName;

    public String toto() {
        return ("chemin => " + chemin );
    }

}
