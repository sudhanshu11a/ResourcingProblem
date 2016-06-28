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
@Table(name = "skill")
public class SkillEntity extends BaseEntity {

	private MasterSkillEntity masterSkillEntity;
	
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
