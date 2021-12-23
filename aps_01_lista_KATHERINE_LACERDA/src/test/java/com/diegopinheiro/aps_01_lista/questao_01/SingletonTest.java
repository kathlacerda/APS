package com.diegopinheiro.aps_01_lista.questao_01;

import java.lang.reflect.Constructor;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

	@Test
	public void test01InstanceIsNotNull() {
		Singleton instance = Singleton.getInstance();
		Assert.assertTrue(instance != null);
	}

	@Test
	public void test02TwoSingletonsSameInstance() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Assert.assertTrue(s1 == s2);
		Assert.assertEquals(s1, s2);
	}

	@Test
	public void test03ConstructorIsNotPublic() {
		Class<Singleton> aClass = Singleton.class;
		Constructor<Singleton> constructor;
		try {
			constructor = aClass.getConstructor();
			constructor.newInstance();
			Assert.fail("Constructor is public");
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
	}
}
