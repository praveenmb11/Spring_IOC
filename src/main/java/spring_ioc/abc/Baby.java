package spring_ioc.abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Baby {
	@Autowired
	Icecream i;
	void open() {
		i.eat();
	}
}
