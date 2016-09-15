package com.example;

import com.sun.media.sound.SimpleSoundbank;

public class ClasseTeste {
	
	static ClasseTeste ct = new ClasseTeste ();
	
	public static void main(String[] args) {
		System.out.println("Main method");
		ct.soma();
	
	}
	public int soma(){
		
		int a=2;
		int b=3;
		int soma = a+b;
		
		System.out.println(soma);
		
		return soma;
		
	}
	
	

}
