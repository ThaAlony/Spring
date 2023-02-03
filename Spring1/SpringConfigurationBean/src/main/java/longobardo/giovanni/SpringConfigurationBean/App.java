package longobardo.giovanni.SpringConfigurationBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        	
    	Phone p = factory.getBean(Phone.class); // crea l'oggetto Phone controllando in AppConfig
    	p.config();
    }
}
