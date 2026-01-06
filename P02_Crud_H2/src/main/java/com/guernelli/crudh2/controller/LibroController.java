package com.guernelli.crudh2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guernelli.crudh2.model.LibroEntity;
import com.guernelli.crudh2.repository.LibroRepository;

@RestController
@RequestMapping("/api/libri")
public class LibroController {

	@Autowired	// Spring inietta (injection) automaticamente il repository
	private LibroRepository libroRepository;
	
	
	// READ - GET tutti i libri
	@GetMapping
	public List<LibroEntity> getAllBooks() { return libroRepository.findAll();} 
	
	// READ - GET un  libro per ID
	@GetMapping("/{id}")
	public ResponseEntity<LibroEntity> getBoolId(@PathVariable Long id) {
		return libroRepository.findById(id)
				.map(libro -> ResponseEntity.ok(libro))
				.orElse(ResponseEntity.notFound().build());
	}
	
	// CREATE - POST /api/libri
		@PostMapping
		public LibroEntity createBook(@RequestBody LibroEntity libro) {
			return libroRepository.save(libro);
		}
		
		
	// UPDATE - PUT /api/libri/{id}
	@PutMapping("/{id}")
	public ResponseEntity<LibroEntity> updateBook(@PathVariable Long id, @RequestBody LibroEntity dettagliLibro) {
		return libroRepository.findById(id)
				.map(libro -> {
					libro.setTitolo(dettagliLibro.getTitolo());
					libro.setAutore(dettagliLibro.getAutore());
					libro.setAnnoPubblicazione(dettagliLibro.getAnnoPubblicazione());
					LibroEntity updated = libroRepository.save(libro);
					return ResponseEntity.ok(updated);
				})
				.orElse(ResponseEntity.notFound().build());
		}
	
	// DELETE - DELETE /api/books/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        if (libroRepository.existsById(id)) {
            libroRepository.deleteById(id);
            return ResponseEntity.noContent().build();  // 204 No Content
        }
        return ResponseEntity.notFound().build();
    }
	

}
