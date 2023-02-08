package com.axis.internalJobservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class InternalJob {
	@Id
	@GeneratedValue
	private int jobId;
	private int projectId;
	private String jobName;
	private String jobInfo;
	private String jobExperience;
	public InternalJob() {
	}
	public InternalJob(int jobId, int projectId, String jobName, String jobInfo, String jobExperience) {
		this.jobId = jobId;
		this.projectId = projectId;
		this.jobName = jobName;
		this.jobInfo = jobInfo;
		this.jobExperience = jobExperience;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public String getJobExperience() {
		return jobExperience;
	}
	public void setJobExperience(String jobExperience) {
		this.jobExperience = jobExperience;
	}
	public String getJobInfo() {
		return jobInfo;
	}
	public void setJobInfo(String jobInfo) {
		this.jobInfo = jobInfo;
	}
	@Override
	public String toString() {
		return "InternalJob [jobId=" + jobId + ", projectId=" + projectId + ", jobName=" + jobName + ", jobInfo="
				+ jobInfo + ", jobExperience=" + jobExperience + "]";
	}
	
	
}
