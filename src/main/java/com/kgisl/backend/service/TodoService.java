package com.kgisl.backend.service;

import java.util.List;

import com.kgisl.backend.model.Todo;

public interface TodoService {
	public List<Todo> findAll();
	public void saveTodo(Todo Todo);
    public void updateTodo(Todo Todo,Long id);
	public Todo findOne(long id);
    public void delete(long id);	
}