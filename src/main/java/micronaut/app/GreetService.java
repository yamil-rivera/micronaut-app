package micronaut.app;

import javax.inject.Singleton;

@Singleton
public class GreetService {

	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
