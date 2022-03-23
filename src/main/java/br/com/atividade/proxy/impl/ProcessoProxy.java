package br.com.atividade.proxy.impl;

import br.com.atividade.proxy.ProcessoCaro;

public class ProcessoProxy implements ProcessoCaro {
    
	private static ProcessoCaro objetomuitocaro;
 
/* Agora vamos utilizar o padrão Proxy e inicializar
nosso objeto */
	
    @Override
    public void process() {
        if (objetomuitocaro == null) {
        	objetomuitocaro = new ProcessoCaroImpl();
        }
        
        objetomuitocaro.process();
    }
}
