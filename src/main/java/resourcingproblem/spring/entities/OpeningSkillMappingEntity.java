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
@Table(name = "opening_skill_mapping")
public class OpeningSkillMappingEntity extends BaseEntity{

	@ManyToOne
	@JoinColumn(name = "opening", nullable = false)
	private OpeningEntity opening;
	
	@ManyToOne
	@JoinColumn(name = "skill", nullable = false)
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
