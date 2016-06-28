/**
 * 
 */
package resourcingproblem.spring.enums;

/**
 * @author sudhanshusharma
 *
 */
public enum RatingEnum {
	
	APLUS(4), A(3), BPLUS(2), B(1);
	
	private int value;

	private RatingEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
