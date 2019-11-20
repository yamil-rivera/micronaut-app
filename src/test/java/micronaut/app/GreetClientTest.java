package micronaut.app;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.jupiter.api.*;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetClientTest {
	private static EmbeddedServer server;
	private static GreetClient client;

	@BeforeAll
	public static void setup() {
		server = ApplicationContext.run(EmbeddedServer.class);
		client = server.getApplicationContext().getBean(GreetClient.class);
	}

	@AfterAll
	public static void cleanup() {
		server.stop();
	}

	@Test
	public void testGreeting() {
		client.setGreet("Hello");
		assertEquals( "Hello Mike", client.greet("Mike"));
	}
}
