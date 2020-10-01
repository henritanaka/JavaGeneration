package com.helloworld1.hello1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello1")
public class HelloController {
	
	@GetMapping
	public String jose() {
		return " Habilidades e mentalidades utilizadas na atividade:\n\tMentalidade: persistência, mentalidade de crescimento,"
				+ " responsabilidade pessoal;\n\tHabilidade: Atenção aos detalhes";
	}

}
