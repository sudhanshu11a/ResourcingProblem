/**
 * 
 */
package resourcingproblem.spring.dto;

import resourcingproblem.spring.enums.SkillLevel;

/**
 * @author sudhanshusharma
 *
 */
public class Skill {

	private String name;
	
	private SkillLevel level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SkillLevel getLevel() {
		return level;
	}

	public void setLevel(SkillLevel level) {
		this.level = level;
	}

	

}
