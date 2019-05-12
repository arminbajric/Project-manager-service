package project.manager.restfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.manager.restfull.models.DocumentationModel;

@Repository
public interface DocumentationRepository extends JpaRepository<DocumentationModel,Long> {
}
