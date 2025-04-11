package servidor;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class ServidorMagico {

    public static void main(String[] args) throws IOException {
        // Crea el servidor en el puerto 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        
        // Define el manejador para las solicitudes
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "<h1>¡Bienvenido a mi servidor!</h1>";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });

        // Arranca el servidor
        server.start();
        System.out.println("Servidor escuchando en el puerto 8080...");
    }
}
