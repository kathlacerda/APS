package com.diegopinheiro.aps_01_lista.questao_02;

public class ClientApp {
	private static ClientApp uniqueInstance;
	private ClientRepository clientRepository;
	String MESSAGE_CLIENT_EXISTS = "Repository already constains client";

	private ClientApp(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;

	}

	public static ClientApp getInstance(ClientRepository clientRepository) {
		if (uniqueInstance == null) {
			uniqueInstance = new ClientApp(clientRepository);
		}
		return uniqueInstance;
	}

	public static void resetInstance() {
		uniqueInstance = null;

	}

	public void addClient(ClientBase clientAdded) throws Exception {
		if (containsClient(clientAdded.getId()) ==false) {
			clientRepository.add(clientAdded);
		} else {
			throw new Exception("Repository already constains client");
		}

	}

	public boolean containsClient(String clientId) {
		
		return clientRepository.contains(clientId);
	}

}
