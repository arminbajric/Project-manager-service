package project.manager.restfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.manager.restfull.models.RolesModel;

@Repository
public interface RolesRepository extends JpaRepository<RolesModel,Long> {
}
