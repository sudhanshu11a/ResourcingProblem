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
@Table(name = "opening_skill_mapping")
public class OpeingSkillMappingEntity extends BaseEntity{

	private OpeningEntity opening;
	
	private SkillEntity skill;

	public OpeningEntity getOpening() {
		return opening;
	}

	public void setOpening(OpeningEntity opening) {
		this.opening = opening;
	}

	public SkillEntity getSkill() {
		return skill;
	}

	public void setSkill(SkillEntity skill) {
		this.skill = skill;
	}


	
	
}
