/**
 * 
 */
package resourcingproblem.spring.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author sudhanshusharma
 *
 */
@Entity
@Table(name = "resource_skill_mapping")
public class ResourceSkillMappingEntity extends BaseEntity{

	@ManyToOne
	@JoinColumn(name = "resource", nullable = false)
	private ResourceEntity resource;
	
	@ManyToOne
	@JoinColumn(name = "skill", nullable = false)
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
