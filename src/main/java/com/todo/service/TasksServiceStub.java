package com.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.todo.dao.ITasksDAO;
import com.todo.dto.TasksDTO;


@Component
public class TasksServiceStub implements ITasksService {
	
	private ITasksDAO tasksDAO;
	
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
