package project.manager.restfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.manager.restfull.models.TasksModel;

@Repository
public interface TasksRepository extends JpaRepository<TasksModel,Long> {
}
