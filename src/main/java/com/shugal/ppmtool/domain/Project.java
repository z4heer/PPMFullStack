package com.shugal.ppmtool.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String projectName;
	private String projectIdentifier;
	private String description;
	private Date start_date;
	private Date end_date;

	private Date created_At;
	private Date updated_At;

	public Project() {
	}
	
	@PrePersist
	protected void onCreate() {
		this.created_At= new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.created_At= new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return start_date;
	}

	public void setStartDate(Date startDate) {
		this.start_date = startDate;
	}

	public Date getEndDate() {
		return end_date;
	}

	public void setEndDate(Date endDate) {
		this.end_date = endDate;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public Date getUpdated_At() {
		return updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}

	
}
