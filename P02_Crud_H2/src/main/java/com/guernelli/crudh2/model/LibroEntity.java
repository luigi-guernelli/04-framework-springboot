package com.guernelli.crudh2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity					 // Questa classe rappresenta una tabella
@Table(name="libri")     // Nome tabella (opzionale)
public class LibroEntity {
	
	@Id 	// Chiave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment
	private Long id;
	
	@Column(nullable = false)   // Non può essere vuoto
	private String titolo;
	
	private String autore;
	
	private int annoPubblicazione;
	
	// Costruttore vuoto (*obbligatorio* JPA)
	public LibroEntity() {}
	
	// Costruttore con parametri
	public LibroEntity(String titolo, String autore, int annoPubblicazione) {
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
	}

	// Getter e Setter
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getTitolo() { return titolo; }
	public void setTitolo(String titolo) { this.titolo = titolo; }

	
	public String getAutore() {	return autore; }
	public void setAutore(String autore) { this.autore = autore; }

	public int getAnnoPubblicazione() { return annoPubblicazione; }
	public void setAnnoPubblicazione(int annoPubblicazione) { this.annoPubblicazione = annoPubblicazione; }

	@Override
	public String toString() {
		return "LibroEntity "
				+ "[id=" + id + 
				", titolo=" + titolo + 
				", autore=" + autore + 
				", annoPubblicazione="
				+ annoPubblicazione + "]";
	}
	
	
}
