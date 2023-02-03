package longobardo.giovanni.SpringConfigurationBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Praticamente sta classe rimpiazza "spring.xml"
public class AppConfig {

	@Bean // rimpiazza il tag "bean", quindi dice che il metodo qui sotto è un Bean
	public Phone getPhone() {
		return new Phone();
	}
	
	@Bean
	public Processor getProcessor() {
		return new Intel();
	}
	
	//what if non voglio creare questi bean? check next Spring tutorial
}
