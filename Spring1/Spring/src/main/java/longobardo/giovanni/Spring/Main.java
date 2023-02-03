package longobardo.giovanni.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		/*
		 * voglio fare in modo che v.drive() funzioni sempre senza dover cambiare quesa classe, come?
		 * 
		 * posso fare un interfaccia che comprenda entrambe le classi, si ma dovrei
		 * comunque cambiare poi il tipo di oggetto nella dichiarazione, ex:
		 * Vehicle v = Car();  o  Vechicle v = Bike();
		 * ed io non voglio cambiare neanche una singola dichiarazione, come faccio?
		 * Uso Spring ed il metodo getBean() che si trova sia in BeanFactory sia in 
		 * Application Context ( per applicazioni grandi si usa Application Context)
		 * 
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // ApplicationContext è un interfaccia
		
		
		
		Vehicle v = (Vehicle) context.getBean("vehicle");  // getBean ritorna un Object quindi famo il casting
		// non va lo stesso! perché non sa che bean è un vehicle, per cui creiamo un file xml ( in questo caso Spring.xml
		v.drive();
	}

}
