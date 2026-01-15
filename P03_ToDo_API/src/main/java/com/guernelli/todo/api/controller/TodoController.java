package com.guernelli.todo.api.controller;

import java.net.URI;
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

import com.guernelli.todo.api.model.TodoEntity;
import com.guernelli.todo.api.repository.TodoRepository;
import com.guernelli.todo.api.service.TodoService;


import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoRepository todoRepository;

	@Autowired
	private TodoService todoService;

    TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
	
	// Get tutti
	@GetMapping
	List<TodoEntity> getAll() {
		return todoService.findAll();
	}
	
	// GET uno
    @GetMapping("/{id}")
    public ResponseEntity<TodoEntity> getById(@PathVariable Long id) {
        return todoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
 // POST nuovo - @Valid attiva la validazione
    @PostMapping
    public ResponseEntity<TodoEntity> create(@Valid @RequestBody TodoEntity todo) {
        TodoEntity saved = todoService.save(todo);
        return ResponseEntity.created(URI.create("/api/todos/" + saved.getId())).body(saved);
    }

    // PUT update
    @PutMapping("/{id}")
    public ResponseEntity<TodoEntity> update(@PathVariable Long id, @Valid @RequestBody TodoEntity todo) {
        if (!todoService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        todo.setId(id);
        TodoEntity updated = todoService.save(todo);
        return ResponseEntity.ok(updated);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!todoService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        todoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}
