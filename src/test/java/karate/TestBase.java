package karate;

import org.junit.jupiter.api.BeforeAll;
import karate.server.ServerStart;

public abstract class TestBase {

    private static ServerStart server;

    public static int startServer() throws Exception {
        if (server == null) { // keep spring boot side alive for all tests including package 'mock'
            server = new ServerStart();
            server.start(new String[]{"--server.port=0"}, false);
        }
        System.setProperty("demo.server.port", server.getPort() + "");
        return server.getPort();
    }

    @BeforeAll
    public static void beforeAll() throws Exception {
        startServer();
    }

}