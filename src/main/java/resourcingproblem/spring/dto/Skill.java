/**
 * 
 */
package resourcingproblem.spring.dto;

import resourcingproblem.spring.enums.SkillLevelEnum;

/**
 * @author sudhanshusharma
 *
 */
public class Skill {

	private String name;
	
	private SkillLevelEnum level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SkillLevelEnum getLevel() {
		return level;
	}

	public void setLevel(SkillLevelEnum level) {
		this.level = level;
	}

	
	@Override
    public boolean equals(Object o) {
        if ((o instanceof Skill) && (((Skill) o).getName().equals(this.name)) && (((Skill) o).getLevel().getValue() <= this.level.getValue())) {
            return true;
        } else {
            return false;
        }
    }
 
	@Override
	public int hashCode()
	{
	    final int PRIME = 31;
	    int result = 1;
	    result = PRIME * result + (( name == null ) ? 0 : name.hashCode());
	    result = PRIME * result + (( level == null) ? 0 : level.hashCode());
	    return result;
	}

}
