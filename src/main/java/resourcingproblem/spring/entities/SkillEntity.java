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
@Table(name = "skill")
public class SkillEntity extends BaseEntity {

	@ManyToOne
	@JoinColumn(name="master_skill", nullable=false)
	private MasterSkillEntity masterSkillEntity;
	
	@ManyToOne
	@JoinColumn(name = "master_skell_level", nullable = false)
	private MasterSkillLevelEntity masterSkillLevelEntity;

	public MasterSkillEntity getMasterSkillEntity() {
		return masterSkillEntity;
	}

	public void setMasterSkillEntity(MasterSkillEntity masterSkillEntity) {
		this.masterSkillEntity = masterSkillEntity;
	}

	public MasterSkillLevelEntity getMasterSkillLevelEntity() {
		return masterSkillLevelEntity;
	}

	public void setMasterSkillLevelEntity(MasterSkillLevelEntity masterSkillLevelEntity) {
		this.masterSkillLevelEntity = masterSkillLevelEntity;
	}
	
	
	
}
