package com.axis.internalJobservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.axis.internalJobservice.entity.InternalJob;
import com.axis.internalJobservice.exception.JobNotFoundException;
import com.axis.internalJobservice.repository.InternalJobRepository;
@Service
public class InternalJobServiceImpl implements InternalJobService{
	
	@Autowired
	InternalJobRepository internalJobRepository;
	
	@Override
	public InternalJob findById(int jobId) {
		// TODO Auto-generated method stub
		Optional<InternalJob> jobOpt = internalJobRepository.findById(jobId);
		if(!jobOpt.isPresent())
			throw new JobNotFoundException("Employee Not Found by Id "+jobId);
		return jobOpt.get();
	}

	@Override
	public List<InternalJob> getAllInternalJobs() {
		// TODO Auto-generated method stub
		return internalJobRepository.findAll();
	}

	@Override
	public InternalJob addInternalJob(InternalJob internalJob) {
		// TODO Auto-generated method stub
		return internalJobRepository.save(internalJob);
	}

	@Override
	public void deleteInternalJobById(int jobId) {
		// TODO Auto-generated method stub
		internalJobRepository.deleteById(jobId);
	}

	@Override
	public InternalJob updateInternalJobById(InternalJob internalJob, int jobId) {
		// TODO Auto-generated method stub
		InternalJob toUpdate =internalJobRepository.findById(jobId).get();
		toUpdate.setJobName(internalJob.getJobName());
		toUpdate.setJobExperience(internalJob.getJobExperience());
		toUpdate.setJobInfo(internalJob.getJobInfo());
		return internalJobRepository.save(toUpdate);
	}

}
