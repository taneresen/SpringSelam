package com.mimaraslan.ana;

public class Araba {//h

	private Yakit yakit;

	public Araba(Yakit yakit) {

		this.yakit = yakit;
	}

	public void hareketeGec() {
		yakit.depo();
		System.out.println("Araba Harekete Gecti Abim");
	}

}
