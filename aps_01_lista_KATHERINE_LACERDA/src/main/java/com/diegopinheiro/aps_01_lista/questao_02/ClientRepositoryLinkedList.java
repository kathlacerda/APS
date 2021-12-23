package com.diegopinheiro.aps_01_lista.questao_02;

import java.util.*;

public class ClientRepositoryLinkedList extends ClientRepository {
	private LinkedList<ClientBase> clientRepository = new LinkedList<ClientBase>();

	public ClientRepositoryLinkedList() {
		clientRepository = new LinkedList<ClientBase>();
	}

	@Override
	public void add(ClientBase client) {
		clientRepository.add(client);

	}

	@Override
	public boolean contains(String clientId) {
		for (ClientBase clients : clientRepository) {
			if (clients.getId().equals(clientId)) {
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
