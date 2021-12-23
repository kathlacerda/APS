package com.diegopinheiro.aps_01_lista.questao_02;

import java.util.ArrayList;

public class ClientRepositoryArrayList extends ClientRepository {
	private ArrayList<ClientBase> clientRepository = new ArrayList<ClientBase>();

	public ClientRepositoryArrayList() {
		clientRepository = new ArrayList<ClientBase>();
	}

	@Override
	public void add(ClientBase client) {
		clientRepository.add(client);
	}

	@Override
	public boolean contains(String clientId) {
		for (ClientBase clients : clientRepository) {
			if(clients.getId().equals(clientId)) {
				return true;
			}
		}

		return false;

	}
	@Override
	protected boolean isEmpty() {
		return clientRepository.size() == 0;
	}
	

}
