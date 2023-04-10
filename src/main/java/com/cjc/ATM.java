package com.cjc;

public class ATM {

	private IPrinter printer;

	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}

	public String withdraw() {
		System.out.println("Amount withdraw success");
		return "withdraw success";
	}
}
