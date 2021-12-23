package com.diegopinheiro.aps_01_lista.questao_02;

public class ClientArrayListTest extends ClientRepositoryTest {

	@Override
	public ClientRepository getRepository() {
		return new ClientRepositoryArrayList();
	}

}
