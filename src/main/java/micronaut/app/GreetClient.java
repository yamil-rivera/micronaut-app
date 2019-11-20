package micronaut.app;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client("/greet")
public interface GreetClient {

	@Get(value = "/{name}")
	String greet(String name);

	@Post(produces = MediaType.TEXT_PLAIN)
	void setGreet(@Body String greeting);
}
