package com.ci.demo.services;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.ci.demo.beans.Task;

@Component
public class CiServiceImpl implements CiDemoServices{

	@Override
	public ArrayList<Task> fetchAllCITasks() {
		
		ArrayList<Task> ciBeanList= new ArrayList<>();
		
		Task tsk= new Task("Task1", 1001, " Task new");
		ciBeanList.add(tsk);
		return ciBeanList;
	}
	


}
