package com.axis.internalJobservice.service;

import java.util.List;

import com.axis.internalJobservice.entity.InternalJob;



public interface InternalJobService {
	public InternalJob findById(int jobId);

	public List<InternalJob> getAllInternalJobs();

	public InternalJob addInternalJob(InternalJob internalJob);

	public void deleteInternalJobById(int jobId);

	public InternalJob updateInternalJobById(InternalJob internalJob, int jobId);	
}
