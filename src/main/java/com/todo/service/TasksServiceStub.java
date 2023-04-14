package com.todo.service;

import org.springframework.stereotype.Component;

import com.todo.dto.TasksDTO;


@Component
public class TasksServiceStub implements ITasksService {
	
	@Override
	public TasksDTO fetchById(int id) {
		TasksDTO tasksDTO = new TasksDTO();
		tasksDTO.setTasksId(1);
		tasksDTO.setTitle("Take out trash");
		tasksDTO.setDescription("Put trash out Sunday night");
		tasksDTO.setStatusId(1);
		return tasksDTO;	
	}
	
	@Override
	public void save (TasksDTO tasksDTO) {
		
	}

}
