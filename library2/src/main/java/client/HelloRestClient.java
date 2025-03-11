package it.edu.marconipontedera.tepsit.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class HelloRestClient {
    public static void main(String[] args) {
        // Crea un'istanza del client Jersey
        Client client = ClientBuilder.newClient();

        // URL del servizio REST che hai nel server (assicurati che sia corretto)
        String serverUrl = "http://localhost:8080/hello-rest/yourResource"; // Modifica questo con il percorso corretto

        // Fai una richiesta GET al server
        Response response = client.target(serverUrl)
                                  .request()
                                  .get();

        // Stampa la risposta del server
        System.out.println("Response Code: " + response.getStatus());
        System.out.println("Response Body: " + response.readEntity(String.class));

        // Chiudi la risposta e il client
        response.close();
        client.close();
    }
}
