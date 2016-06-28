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
@Table(name = "resource_skill_mappling")
public class ResourceSkillMappingEntity extends BaseEntity{

	private ResourceEntity resource;
	
	private SkillEntity skill;

	public ResourceEntity getResource() {
		return resource;
	}

	public void setResource(ResourceEntity resource) {
		this.resource = resource;
	}

	public SkillEntity getSkill() {
		return skill;
	}

	public void setSkill(SkillEntity skill) {
		this.skill = skill;
	}
	
	
}
