/**
 * 
 */
package resourcingproblem.spring.enums;

/**
 * @author sudhanshusharma
 *
 */
public enum SkillLevel {

	BEGINNER(1), INTERMEDIATE(2), EXPERT(3);

	private int value;

	private SkillLevel(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
