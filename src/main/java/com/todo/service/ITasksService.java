package com.todo.service;

import com.todo.dto.TasksDTO;


	public interface ITasksService {
		
		TasksDTO fetchById(int id);
		
		void save(TasksDTO tasksDTO);
	}

