package com.diegopinheiro.aps_01_lista.questao_02;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public abstract class ClientRepositoryTest {

	private ClientApp clientApp;
	String MESSAGE_CLIENT_EXISTS = "Repository already constains client";

	@Before
	public void setUp() {
		ClientRepository clientRepository = this.getRepository();
		this.clientApp = ClientApp.getInstance(clientRepository);
	}

	@After
	public void tearDown() {
		ClientApp.resetInstance();
	}

	@Test
	public void test01ContainsClientBaseFalse() {
		ClientApp app = this.clientApp;
		String clientId = "ClientId";
		boolean containsClient = app.containsClient(clientId);
		Assert.assertFalse(containsClient);
	}
	
	@Test
	public void test02ContainsClientIndividualTrue() {
		ClientApp app = this.clientApp;
		String clientId = "ClientId";
		ClientBase clientAdded = new ClientIndividual(clientId);
		try {
			app.addClient(clientAdded);
		} catch (Exception e) {
			Assert.fail();
		}
		boolean containsClient = app.containsClient(clientId);
		Assert.assertTrue(containsClient);
	}
	
	@Test
	public void test03ContainsClientCompanyTrue() {
		ClientApp app = this.clientApp;
		String clientId = "ClientId";
		ClientBase clientAdded = new ClientCompany(clientId);
		try {
			app.addClient(clientAdded);
		} catch (Exception e) {
			Assert.fail();
		}
		boolean containsClient = app.containsClient(clientId);
		Assert.assertTrue(containsClient);
	}

	@Test
	public void test04AddClientIndividualTrue() {
		ClientApp app = this.clientApp;
		String clientId = "ClientId";
		ClientBase clientAdded = new ClientIndividual(clientId);
		try {
			app.addClient(clientAdded);
		} catch (Exception e) {
			Assert.fail();
		}

		boolean containsClient = app.containsClient(clientId);
		Assert.assertTrue(containsClient);
	}

	@Test
	public void test05AddClientIndividualFail() {
		ClientApp app = this.clientApp;
		String clientId = "ClientId";
		ClientBase clientAdded = new ClientIndividual(clientId);
		ClientBase clientAddedAgain = new ClientIndividual(clientId);
		try {
			app.addClient(clientAdded);
			app.addClient(clientAddedAgain);
			Assert.fail();
		} catch (Exception e) {
			Assert.assertEquals(MESSAGE_CLIENT_EXISTS, e.getMessage());
		}
	}
	
	@Test
	public void test06AddClientCompanyTrue() {
		ClientApp app = this.clientApp;
		String clientId = "ClientId";
		ClientBase clientAdded = new ClientCompany(clientId);
		try {
			app.addClient(clientAdded);
		} catch (Exception e) {
			Assert.fail();
		}

		boolean containsClient = app.containsClient(clientId);
		Assert.assertTrue(containsClient);
	}

	@Test
	public void test07AddClientCompanyFail() {
		ClientApp app = this.clientApp;
		String clientId = "ClientId";
		ClientBase clientAdded = new ClientCompany(clientId);
		ClientBase clientAddedAgain = new ClientCompany(clientId);
		try {
			app.addClient(clientAdded);
			app.addClient(clientAddedAgain);
			Assert.fail();
		} catch (Exception e) {
			Assert.assertEquals(MESSAGE_CLIENT_EXISTS, e.getMessage());
		}
	}


	public abstract ClientRepository getRepository();

}
