package com.guernelli.crudh2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guernelli.crudh2.model.LibroEntity;

@Repository
public interface LibroRepository extends JpaRepository<LibroEntity, Long>{
	// Spring crea automaticamente tutti i metodi CRUD
	// gia presenti nel JpaRepository
	// Esempi: findAll(), findById(), save(), deleteById(), ecc.
	
//	List<LibroEntity> findAll(); // READ - tutti i libri
//	Optional<LibroEntity> findById(Long id); // READ - un libro per id
//	LibroEntity save(LibroEntity libro); // CREATE / UPDATE - salva o aggiorna un libro
//	void deleteById(Long id); // DELETE - cancella per ID

}
