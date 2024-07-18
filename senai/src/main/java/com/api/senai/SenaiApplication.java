package com.api.senai;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SenaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenaiApplication.class, args);

		dividePorZero();

		System.out.println("Fim do programa.");

	}

	public static void dividePorZero(){

		System.out.println("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		
		try {
			int numero = sc.nextInt();
	
			System.out.println("Informe o divisor: ");
			// Dispara um erro InputMismatch caso digite uma letra
			int divisor = sc.nextInt();

			System.out.println("O resultado da divisão é: " 

			// Dispara um erro caso o divisor informado seja 0
			+ (numero / divisor));

		} catch (Exception e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
}
