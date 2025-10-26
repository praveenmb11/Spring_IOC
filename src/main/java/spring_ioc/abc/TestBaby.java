package spring_ioc.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBaby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		Baby b1=ac.getBean(Baby.class);
		Baby b2 = ac.getBean(Baby.class);
		b2.open();
		b1.open();
		System.out.println(b1==b2);
	}

}
