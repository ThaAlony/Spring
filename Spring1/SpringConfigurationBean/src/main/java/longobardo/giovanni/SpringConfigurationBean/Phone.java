package longobardo.giovanni.SpringConfigurationBean;

import org.springframework.beans.factory.annotation.Autowired;

public class Phone {

	
	
	@Autowired // controlla in config se ho il bean per il Processor
	Processor cpu;  // IN QUESTO MODO non abbiamo dovuto inizializzare nessun oggetto di tipo Processor (di fatto processor è un interfaccia
	
	
	public Processor getCpu() {
		return cpu;
	}


	public void setCpu(Processor cPU) {
		cpu = cPU;
	}


	public void config() {
		System.out.println("Hexa Core, 8 GB RAM");
		cpu.process();
	}
}
