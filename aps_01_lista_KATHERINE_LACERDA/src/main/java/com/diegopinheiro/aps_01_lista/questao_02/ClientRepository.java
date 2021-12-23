package com.diegopinheiro.aps_01_lista.questao_02;

public abstract class ClientRepository {
	
	public abstract void add(ClientBase client);
	
	public abstract boolean contains(String clientid);
	protected abstract boolean isEmpty();
	

}
