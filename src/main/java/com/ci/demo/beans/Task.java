package com.ci.demo.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.stereotype.Component;

@Component
@Document(indexName="TaskSearch",type="Tasks")
public class Task {
	
	@Id
	public Integer taskId;
	public String taskName;

	public String taskDesc;
	
	public Task()
	{
		
	}
	public Task(String taskName, Integer taskId, String taskDesc) {
		super();
		this.taskName = taskName;
		this.taskId = taskId;
		this.taskDesc = taskDesc;
	}
	
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskDesc() {
		return taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}


}
