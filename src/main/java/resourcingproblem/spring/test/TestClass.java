/**
 * 
 */
package resourcingproblem.spring.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import resourcingproblem.spring.model.CompanyOpenings;
import resourcingproblem.spring.model.CompanyResources;
import resourcingproblem.spring.model.Opening;
import resourcingproblem.spring.model.Resource;

/**
 * @author sudhanshusharma
 *
 */
@Component
public class TestClass {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		springCall();
		CompanyOpenings openings = populateOpenings();
		CompanyResources resources = populateResources();
		checkProjects(openings);
		}
	
	
	private static void checkProjects(CompanyOpenings openings){
		Map<String, Integer> projectOpenings = new HashMap<String, Integer>();
		long startTime = System.nanoTime();
		for (Opening opening : openings.getOpeningList()) {
			String projectName = opening.getProjectName();
			if (!projectOpenings.containsKey(projectName)) {
				int freq = Collections.frequency(openings.getOpeningList(), opening);
				projectOpenings.put(projectName, freq);
			}
		}
		// Print some data to console to see if results are correct
		long endTime = System.nanoTime();

		//TimeUnit.SECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS ;  
		//double duration = TimeUnit.SECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS) ;  
		double duration = (endTime - startTime)/1_000_000;
		System.out.println(projectOpenings.size());
		System.out.println("time taken to process records---" + duration);
	
	}
	
	private static void springCall(){
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

		obj.printHello();
	}

	/**
	 * @return
	 * @throws FileNotFoundException
	 */
	private static CompanyOpenings populateOpenings() throws FileNotFoundException {
		FileReader reader = new FileReader("E:\\contest\\data_june14\\openings.xml"); // load
		XStream xstream = new XStream(new StaxDriver());
		xstream.registerConverter(new DateConverter("yyyy-MM-dd", new String[] {}));
		xstream.processAnnotations(CompanyOpenings.class); // inform XStream to
															// parse annotations
															// in Data
		xstream.processAnnotations(Opening.class); // and in two other
													// classes...
		CompanyOpenings data = (CompanyOpenings) xstream.fromXML(reader); // parse
		return data;
	}

	/**
	 * @return
	 * @throws FileNotFoundException
	 */
	private static CompanyResources populateResources() throws FileNotFoundException {
		FileReader reader = new FileReader("E:\\contest\\data_june14\\resources.xml"); // load
		XStream xstream = new XStream(new StaxDriver());
		xstream.processAnnotations(CompanyResources.class); // inform XStream to
															// parse annotations
															// in Data
		xstream.processAnnotations(Resource.class); // and in two other
													// classes...
		CompanyResources data = (CompanyResources) xstream.fromXML(reader); // parse
		return data;
	}
}