package com.guernelli.todo.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guernelli.todo.api.model.TodoEntity;
import com.guernelli.todo.api.repository.TodoRepository;

@Service // Spring gestisce questa classe come bean
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	// Recupera tutti i todo
	public List<TodoEntity> findAll() {
		return todoRepository.findAll();
	}
	
	// Recupera unp per ID
	public Optional<TodoEntity> findById(Long id) {
		return todoRepository.findById(id);
	}
	
	// Salva (crea o aggiorna)
	public TodoEntity save(TodoEntity todo) {
		return todoRepository.save(todo);
	}
	
	// Cancella per ID
	public void deleteById(Long id) {
		todoRepository.deleteById(id);
	}
}
