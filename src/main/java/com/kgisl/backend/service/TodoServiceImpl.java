package com.kgisl.backend.service;

import java.util.List;

import com.kgisl.backend.model.Todo;
import com.kgisl.backend.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Transactional
public class TodoServiceImpl implements TodoService{

	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List<Todo> findAll() {
        return todoRepository.findAll();
	}

	@Override
	public void saveTodo(Todo Todo) {
		todoRepository.save(Todo);
	}

	@Override
	public void updateTodo(Todo todo, Long id) {
		todo.setId(id);
		todoRepository.saveAndFlush(todo);
	}

	@Override
	public Todo findOne(long id) {
		return todoRepository.getOne(id);
	}

	@Override
	public void delete(long id) {
		todoRepository.deleteById(id);
	}
}