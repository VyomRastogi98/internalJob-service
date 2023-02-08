package com.axis.internalJobservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.internalJobservice.entity.InternalJob;
import com.axis.internalJobservice.service.InternalJobService;

@CrossOrigin("http://localhost:3000/")
@RestController
public class InternalJobController {
	@Autowired
	InternalJobService internalJobService;
	@GetMapping("/job/{jobId}")
	public InternalJob getInternalJobById(@PathVariable int jobId) {
		return internalJobService.findById(jobId);
	}
	@GetMapping("/jobs")
	public List<InternalJob> getAllInternalJobs(){
		return internalJobService.getAllInternalJobs();
	}
	@PostMapping("/job")
	public InternalJob addInternalJob(@RequestBody InternalJob internalJob) {
		return internalJobService.addInternalJob(internalJob);
	}
	@DeleteMapping("/job/{jobId}")
	public void deleteEmployeeById(@PathVariable int jobId) {
		internalJobService.deleteInternalJobById(jobId);
	}
	@PutMapping("/job/{jobId}")
	public InternalJob updateInternalJob (@RequestBody InternalJob internalJob, @PathVariable int jobId) {
		return internalJobService.updateInternalJobById(internalJob, jobId);
	}

}
