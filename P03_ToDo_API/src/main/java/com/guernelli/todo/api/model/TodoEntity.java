package com.guernelli.todo.api.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Enità classe per la creazione dei campi nel database
 */
@Entity
@Table(name="todos")
public class TodoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// Il titolo non può essere vuoto nè troppo lungo
	@NotBlank(message = "Il titolo è obbligatorio")
	@Size(min = 3, max = 100, message = "Il titolo deve essere tra 3 e 100 caratteri.")
	private String titolo;
	
	
	// Descrizione opzionale ma con limite
	@Size(max = 500, message = "La descrizione non può superare 500 caratteri.")
	private String descrizione;
	
	// Non può essere nel passato
	@FutureOrPresent(message = "La data di scadenza non può essere nel passato.")
	private LocalDate dueDate;
	
	@NotNull(message = "Lo stato completato è obbligatorio")
	private Boolean completa = false;
	
	// Costruttori
	public TodoEntity() {}
	
	public TodoEntity(String titolo, String descrizione, LocalDate dueDate, Boolean completa) {
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.dueDate = dueDate;
		this.completa = completa;
	}

	// Getter e Setter
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	public String getTitolo() { return titolo; }
	public void setTitolo(String titolo) { this.titolo = titolo; }

	public String getDescrizione() { return descrizione; }
	public void setDescrizione(String descrizione) { this.descrizione = descrizione; }
	
	public LocalDate getDueDate() { return dueDate; }
	public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

	public Boolean getCompleta() { return completa; }
	public void setCompleta(Boolean completa) { this.completa = completa; }
	
	

}
