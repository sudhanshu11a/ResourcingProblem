/**
 * 
 */
package resourcingproblem.spring.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import resourcingproblem.spring.model.CompanyOpenings;
import resourcingproblem.spring.xstream.Opening;

/**
 * @author sudhanshusharma
 *
 */
public class XMLParser {

	
	/**
	 * @return
	 * @throws FileNotFoundException
	 */
//	public <T ? Object>CompanyOpenings populateOpenings() throws FileNotFoundException {
//		FileReader reader = new FileReader("E:\\contest\\data_june14\\openings.xml"); // load
//		XStream xstream = new XStream(new StaxDriver());
//		xstream.registerConverter(new DateConverter("dd-MM-yyyy", new String[] {}));
//		xstream.registerConverter(new BooleanConverter("Y", "N", false));
//		xstream.processAnnotations(CompanyOpenings.class); // inform XStream to
//															// parse annotations
//															// in Data
//		xstream.processAnnotations(Opening.class); // and in two other
//													// classes...
//		CompanyOpenings data = (CompanyOpenings) xstream.fromXML(reader); // parse
//		return data;
//	}
}
