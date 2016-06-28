/**
 * 
 */
package resourcingproblem.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import resourcingproblem.spring.entities.ResourceEntity;

/**
 * @author sudhanshusharma
 *
 */
@Repository
public interface ResourceRepository extends JpaRepository<ResourceEntity, Long>{

	public List<ResourceEntity> getAvailableResourcesOfOpening(Date availableDate);
}
