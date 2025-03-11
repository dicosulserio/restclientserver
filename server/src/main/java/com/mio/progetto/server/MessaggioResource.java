package com.mio.progetto.server;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/messaggio")  // URL finale: http://localhost:8080/api/messaggio
public class MessaggioResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)  // Risponde con testo semplice
    public String getMessaggio() {
        return "Ciao, questo è un messaggio dal server REST!";
    }
}
