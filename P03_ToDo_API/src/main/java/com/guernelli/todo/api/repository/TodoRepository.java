package com.guernelli.todo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guernelli.todo.api.model.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
// Metodi CRUD gia disponibili automaticamente
}
