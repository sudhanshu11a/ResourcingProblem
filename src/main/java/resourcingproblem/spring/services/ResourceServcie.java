/**
 * 
 */
package resourcingproblem.spring.services;

import java.util.List;

import resourcingproblem.spring.exceptions.RemoteServiceException;
import resourcingproblem.spring.model.Opening;
import resourcingproblem.spring.model.Resource;

/**
 * @author sudhanshusharma
 *
 */
public interface ResourceServcie {

	
	public List<Resource> getResourcesForOpening(Opening opening) throws RemoteServiceException;
}
