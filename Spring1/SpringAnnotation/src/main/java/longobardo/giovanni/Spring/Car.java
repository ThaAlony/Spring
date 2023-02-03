package longobardo.giovanni.Spring;

import org.springframework.stereotype.Component;

@Component  //questa classe è un componente ( quindi un bean )
public class Car implements Vehicle{
	
	
	public void drive() {
		System.out.println("Accellero");
	}

}
