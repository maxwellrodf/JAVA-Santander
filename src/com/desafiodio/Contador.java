package com.desafiodio;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("DIGITE O PARAMETRO1");
		int parametro1 = teclado.nextInt();
		System.out.println("DIGITE O PARAMETRO2");
		int parametro2 = teclado.nextInt();
		
		try {
			contar(parametro1, parametro2);
		}catch(ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		
}

	static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
		if(parametro1 > parametro2) 
			throw new  ParametrosInvalidosException();
		
		
		else {
			int contagem = parametro2 - parametro1;
			
			for(int i=1; i<=contagem; i++) {
				System.out.println("Contando ...: " + i);
		}
			
			
			
	}
		
	}
}
	
