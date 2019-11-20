package micronaut.app;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;

@Controller("/greet")
public class GreetController {

	@Inject
	private GreetService greetService;

	@Get(value = "/{name}")
	public String greet(String name) {
		return greetService.getGreeting() + ' ' + name;
	}

	@Post(consumes = MediaType.TEXT_PLAIN)
	public void setGreeting(@Body String greeting) {
		greetService.setGreeting(greeting);
	}
}
