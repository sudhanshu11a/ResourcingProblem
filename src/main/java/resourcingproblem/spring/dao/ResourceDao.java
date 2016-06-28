/**
 * 
 */
package resourcingproblem.spring.dao;

import java.util.List;

import resourcingproblem.spring.exceptions.RemoteServiceException;
import resourcingproblem.spring.model.Opening;
import resourcingproblem.spring.model.Resource;

/**
 * @author sudhanshusharma
 *
 */
public interface ResourceDao {
	
	public List<Resource> getAvailableResourcesOfOpening(Opening opening) throws RemoteServiceException;

}
