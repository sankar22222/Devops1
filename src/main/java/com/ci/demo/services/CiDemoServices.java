package com.ci.demo.services;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.ci.demo.beans.Task;

@Component
public interface CiDemoServices {
	
	public ArrayList<Task> fetchAllCITasks();

}
