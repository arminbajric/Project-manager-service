package project.manager.restfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.manager.restfull.models.ProjectsModel;

@Repository
public interface ProjectsRepository extends JpaRepository<ProjectsModel,Long> {
}
