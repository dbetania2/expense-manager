package com.example.expense_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseManagerApplication.class, args);
		// Mensaje para indicar que la aplicación se ha iniciado exitosamente
		System.out.println("Expense Manager Application has started successfully!");
	}

}
