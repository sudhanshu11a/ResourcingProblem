/**
 * 
 */
package resourcingproblem.spring.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author sudhanshusharma
 *
 */
@Entity
@Table(name = "openingResources")
public class OpeningResourcesEntity extends BaseEntity{

	private OpeningEntity openingEntity;
	
	private ResourceEntity resourceEntity;
	
	private Double score;

	public OpeningEntity getOpeningEntity() {
		return openingEntity;
	}

	public void setOpeningEntity(OpeningEntity openingEntity) {
		this.openingEntity = openingEntity;
	}

	public ResourceEntity getResourceEntity() {
		return resourceEntity;
	}

	public void setResourceEntity(ResourceEntity resourceEntity) {
		this.resourceEntity = resourceEntity;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	
}
