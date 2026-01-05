package com.guernelli.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica che questa classe gestisce richieste HTTP e restituisce dati (non viste).
@RequestMapping("/api") // Tutti gli endpoint partiranno con /api
public class HelloController {

	// Endpoint semplice: GET /
	@GetMapping("/")
	public String home() {
		return "Benvenuto nella mia prima API Spring Boot!";
		
	}
	
	// Endopoint con parametro nel path: GET /ciao/Mario
	@GetMapping("/ciao/{nome}")
	public String ciaoConNome(@PathVariable String nome) {
		return "Ciao, " + nome + "!";
	}
	
	@GetMapping("/saluta")
	public String saluta(@RequestParam(defaultValue = "Ospite") String nome) {
		return "Buongiorno, " + nome + "! Come stai oggi?";
	}
	
	// Endpoint POST con body JSON
	@PostMapping("/eco")
	public String eco(@RequestBody Messaggio messaggio) {
		return "Hai detto: " + messaggio.testo();
	}
	
	// Record semplice per il body JSON
	record Messaggio(String testo) {}

}
