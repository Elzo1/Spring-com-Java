package br.com.elzo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudaçãoController {

	private static final String template = "hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/saudação")
	public Saudação saudação(
			@RequestParam(value = "name", defaultValue = "World")
			String name) {
		return new Saudação(counter.incrementAndGet(), String.format(template, name));
	}
}
