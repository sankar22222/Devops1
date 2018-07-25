package com.ci.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.demo.beans.Task;
import com.ci.demo.services.CiDemoServices;


@RestController
public class CiController{
	
	@Autowired
	CiDemoServices ciServices;


	@GetMapping(path="/fetchTasks",produces="application/json")
	public ArrayList<Task> fetchAllCITasks() {
		// TODO Auto-generated method stub
		return ciServices.fetchAllCITasks();
	}

}
