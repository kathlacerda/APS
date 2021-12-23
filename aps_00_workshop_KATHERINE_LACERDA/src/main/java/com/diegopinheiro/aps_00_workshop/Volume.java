package com.diegopinheiro.aps_00_workshop;

public class Volume {
	public static String getName (int volume) {
		if(volume <= 0) {
			return "Min Volume";
		}else {
			if(volume <= 25) {
				return "Low Volume";
			} else {
				if(volume <= 75) {
					return "Medium Volume";
				} else {
					if (volume < 100) {
						return "High Volume";
					}
				}
			}
			return "Max Volume"; // volum >= cem
		}
		
	}

}
