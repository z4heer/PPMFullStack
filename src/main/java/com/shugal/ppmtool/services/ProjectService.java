package com.shugal.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shugal.ppmtool.domain.Project;
import com.shugal.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project SaveOrUpdateProject(Project project) {
		// some buss logic
		return projectRepository.save(project);
	}
}
