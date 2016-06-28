/**
 * 
 */
package resourcingproblem.spring.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import resourcingproblem.spring.constants.ApplicationConstants;
import resourcingproblem.spring.xstream.XStreamObject;

/**
 * @author sudhanshusharma
 *
 */
public class XMLParser {

	/**
	 * To Parse the xml to Objects using xstream 
	 * @param filePath
	 * @param processClass main processing Annotation class
	 * @param processClasses other processing annotation classes within main processing annotation class
	 * @return
	 * @throws FileNotFoundException
	 */
	@SuppressWarnings("unchecked")
	public <T extends XStreamObject> T populateOpenings(String filePath, Class<T> processClass, Class otherprocessClass) throws FileNotFoundException {
		FileReader reader = new FileReader(filePath); // load
		XStream xstream = new XStream(new StaxDriver());
		xstream.registerConverter(new DateConverter(ApplicationConstants.DATE_FORMATE, new String[] {}));
		xstream.registerConverter(new BooleanConverter(ApplicationConstants.TRUE, ApplicationConstants.FALSE, false));
		xstream.processAnnotations(processClass); // inform XStream to parse annotations in Data
	//	for(Class<T> processAnnotation : processClasses){
		xstream.processAnnotations(otherprocessClass); // and in two other classes...
	//	}
		T data = (T) xstream.fromXML(reader); // parse
		return data;
	}
}
