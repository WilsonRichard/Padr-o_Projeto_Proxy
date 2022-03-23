package br.com.atividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.atividade.proxy.ProcessoCaro;
import br.com.atividade.proxy.impl.ProcessoProxy;

@SpringBootApplication
public class PadraoProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoProxyApplication.class, args);
		
		ProcessoCaro processoCaro = new ProcessoProxy();
		processoCaro.process();
		processoCaro.process();
	
	}

}
