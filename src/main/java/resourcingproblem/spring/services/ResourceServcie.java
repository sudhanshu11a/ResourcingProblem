/**
 * 
 */
package resourcingproblem.spring.services;

import java.util.List;

import resourcingproblem.spring.exceptions.RemoteServiceException;
import resourcingproblem.spring.xstream.Opening;
import resourcingproblem.spring.xstream.Resource;

/**
 * @author sudhanshusharma
 *
 */
public interface ResourceServcie {

	
	public List<Resource> getResourcesForOpening(Opening opening) throws RemoteServiceException;
	
	public List<Resource> getResourcesForOpening(Opening opening, List<Resource> resources) throws RemoteServiceException;
}
