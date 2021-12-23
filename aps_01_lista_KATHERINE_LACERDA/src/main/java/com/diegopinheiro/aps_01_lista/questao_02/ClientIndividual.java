package com.diegopinheiro.aps_01_lista.questao_02;

public class ClientIndividual extends ClientBase {
private String individualId;
	
	public ClientIndividual(String clientId) {
		this.individualId = clientId;
	}
	public String getIndividualId() {
		return this.individualId;
	}
	@Override
	public String getId() {
		return this.individualId;
	}

}
