package project.manager.restfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.manager.restfull.models.WorkersModel;

@Repository
public interface WorkersRepository extends JpaRepository<WorkersModel,Long> {
}
