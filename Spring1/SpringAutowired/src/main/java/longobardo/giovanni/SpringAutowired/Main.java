package longobardo.giovanni.SpringAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // ApplicationContext � un interfaccia
		
		
		
		Vehicle v = (Vehicle) context.getBean("car");
		v.drive();
		
		
		
		Tyre t = (Tyre) context.getBean("tyre");
		System.out.println(t);
		
	}

}
