/**
 * 
 */
package resourcingproblem.spring.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import resourcingproblem.spring.dao.ResourceDao;
import resourcingproblem.spring.exceptions.RemoteServiceException;
import resourcingproblem.spring.model.Opening;
import resourcingproblem.spring.model.Resource;
import resourcingproblem.spring.services.ResourceServcie;

/**
 * @author sudhanshusharma
 *
 */
@Service
public class ResourceServiceImpl implements ResourceServcie{
	
	private ResourceDao resourcesDao;

	@Override
	public List<Resource> getResourcesForOpening(Opening opening) throws RemoteServiceException {
		List<Resource> resources = null;
		List<Resource> avaliableResources = null;
		//get avaliable resources from H2 DB
		resources = resourcesDao.getAvailableResourcesOfOpening(opening);
		
		//check mandatory skills 
		for (Resource resource: resources){
		//	if(resource.)
		}
		
		return null;
	}

}
