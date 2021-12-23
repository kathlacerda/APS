package com.diegopinheiro.aps_01_lista.questao_02;

public class ClientLinkedListTest extends ClientRepositoryTest {

	@Override
	public ClientRepository getRepository() {
		return new ClientRepositoryLinkedList();
	}

}
