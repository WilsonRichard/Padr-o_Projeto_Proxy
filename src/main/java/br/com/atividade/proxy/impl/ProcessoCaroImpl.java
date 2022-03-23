package br.com.atividade.proxy.impl;

import java.util.ArrayList;
import java.util.List;
import br.com.atividade.domain.ListaTelefonica;
import br.com.atividade.proxy.ProcessoCaro;

public class ProcessoCaroImpl implements ProcessoCaro {
	
	private List<ListaTelefonica> lista = new ArrayList<>();
	private ListaTelefonica objeto1 =  new ListaTelefonica();
	private ListaTelefonica objeto2 = new ListaTelefonica();
	
	
    public ProcessoCaroImpl() {
        heavyInitialConfigurationSetup();
    }
     
    @Override
    public void process() {
    	System.out.println("\n Já fui no banco de dados.. agora só estou mostrando \n");
    	for(ListaTelefonica u: lista) {
			 System.out.print("[" + u.getNome() + " - " + u.getTelefone() + "]\n");	 
		 }
    	   
    }
     
    private void heavyInitialConfigurationSetup() {
    	System.out.println("\n Estou consultando no banco de dados pela primeira vez inicio \n");
    	
    	objeto1.setNome("Richard");
    	objeto1.setTelefone("0000");
    	objeto2.setNome("Wilson");
    	objeto2.setTelefone("111");

    	lista.add(objeto1);
    	lista.add(objeto2);
    	
    
    	System.out.print("\n Mostrando a lista ! ...\n");
    	
    	for(ListaTelefonica u: lista) {
			 System.out.print("[" + u.getNome() + " - " + u.getTelefone() + "]\n");	 
		 }
    	
    }

}
