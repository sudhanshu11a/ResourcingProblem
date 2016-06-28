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

	
	@Override
    public boolean equals(Object o) {
        if ((o instanceof Skill) && (((Skill) o).getName() == this.name) && (((Skill) o).getLevel() == this.level)) {
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
