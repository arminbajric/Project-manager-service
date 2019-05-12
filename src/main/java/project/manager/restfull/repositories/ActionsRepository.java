package project.manager.restfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.manager.restfull.models.ActionsModel;

@Repository
public interface ActionsRepository extends JpaRepository<ActionsModel,Long> {
}
