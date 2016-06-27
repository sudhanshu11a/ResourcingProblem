/**
 * 
 */
package resourcingproblem.spring.test;

import org.springframework.stereotype.Component;

/**
 * @author sudhanshusharma
 *
 */
@Component
public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 4 : Hello ! " + name);
	}
}
