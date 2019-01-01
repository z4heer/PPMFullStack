package com.shugal.ppmtool.repositories;

import org.springframework.stereotype.Repository;
import com.shugal.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

}
