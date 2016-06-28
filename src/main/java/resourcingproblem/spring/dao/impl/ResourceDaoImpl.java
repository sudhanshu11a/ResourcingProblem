/**
 * 
 */
package resourcingproblem.spring.dao.impl;

import java.util.List;

import resourcingproblem.spring.dao.ResourceDao;
import resourcingproblem.spring.exceptions.RemoteServiceException;
import resourcingproblem.spring.model.Opening;
import resourcingproblem.spring.model.Resource;

/**
 * @author sudhanshusharma
 *
 */
public class ResourceDaoImpl implements ResourceDao{

	@Override
	public List<Resource> getAvailableResourcesOfOpening(Opening opening) {

		List<Resource> resources = null;
		
		try{
			//get available resources from H2 db
			
		}catch(Exception e){
			throw e;
		}
		

		return null;
	}

}
