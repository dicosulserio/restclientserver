package com.mio.progetto.server;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")  // Tutti gli endpoint REST avranno come prefisso "/api"
public class MyApplicationConfig extends Application {
    // Questa classe abilita Jersey per gestire le richieste REST
}
