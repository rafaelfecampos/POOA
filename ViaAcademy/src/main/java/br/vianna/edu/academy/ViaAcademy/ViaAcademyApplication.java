package br.vianna.edu.academy.ViaAcademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ViaAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaAcademyApplication.class, args);
	}

	@Autowired
	public void run (String... args) throws Exception{
		System.out.println("#### SERVER STARTER ####");

		Professor p
	}
}
