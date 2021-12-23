package com.diegopinheiro.aps_01_lista.questao_02;

public abstract class ClientBase {
	
	public abstract String getId();
	
	@Override
    public boolean equals(Object obj) {
		if(obj instanceof ClientBase) {
			ClientBase other = (ClientBase)obj;
	        return this.getId().equals(other.getId());	
		}
		return false;
         
    }
	
}
