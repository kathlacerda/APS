package com.diegopinheiro.aps_01_lista.questao_02;

public class ClientCompany extends ClientBase {
	private String companyId; 

	public ClientCompany(String clientId) { 
		companyId = clientId;
	}

	public String getCompanyId() {
		return this.companyId;
	}

	@Override
	public String getId() {
		return this.companyId;
	}

}
