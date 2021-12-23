package com.diegopinheiro.aps_00_workshop;

public class Pairing {
	private Pair[] pairs;

	public Pairing(String s1, String s2) throws Exception {
		pairs = obtainPairs(s1, s2);
	}

	private static String[] getList(String s) {
		if (s.equals("")) {
			return new String[0];
		}else {
			return s.split(", ");
		}
	
	}

	public Pair[] obtainPairs(String s1, String s2) throws Exception {
		String[] listaS1 = getList(s1);
		String[] listaS2 = getList(s2);
		pairs = new Pair[listaS1.length];

		if (listaS1.length != listaS2.length) {
			throw new Exception("Cannot obtain pairs with different sizes!");
		}

		for (int i = 0; i < listaS2.length; i++) {
			pairs[i] = new Pair(listaS1[i], listaS2[i]);

		}

		return pairs;
	}

	public String toString() {

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < pairs.length; i++) {
			result.append(pairs[i]);
			if (i < pairs.length - 1) {
				result.append(", ");
			}
		}
		String result2 = result.toString().replace("  ", " ");
		return result2;

	}

	public Pair[] getPairs() {
		return pairs;
	}

	public void setPairs(Pair[] pairs) {
		this.pairs = pairs;
	}

}
