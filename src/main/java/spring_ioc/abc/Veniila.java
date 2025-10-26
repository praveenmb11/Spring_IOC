package spring_ioc.abc;

import org.springframework.stereotype.Component;

@Component
public class Veniila implements Icecream {
@Override
public void eat() {
	System.out.println("Baby eats venilla");
}}
