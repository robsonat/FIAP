package com.fintech.model;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente conta1 = new ContaCorrente(111, 222, 5000.01, 2000.10);
		
		System.out.println(conta1.getSaldo().floatValue());		
		

	}

}
