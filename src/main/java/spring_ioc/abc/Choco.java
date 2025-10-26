package spring_ioc.abc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Choco implements Icecream {
 @Override
	public void eat() {
		System.out.println("Baby eat Choco");
	}

}
