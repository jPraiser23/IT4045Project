package com.todo.dto;

public class TasksDTO {
	
	private int tasksId;
	private String title;
	private String description;
	private int statusId;

	public int getTasksId() {
		return tasksId;
	}
	public void setTasksId(int tasksId) {
		this.tasksId = tasksId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	
	@Override
	public String toString() {
		return tasksId + " " + title + " " + description + " " + statusId + " ";
	}
}
