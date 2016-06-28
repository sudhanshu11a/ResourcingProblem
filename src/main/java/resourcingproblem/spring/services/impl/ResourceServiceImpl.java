/**
 * 
 */
package resourcingproblem.spring.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import resourcingproblem.spring.converter.ResourceConverter;
import resourcingproblem.spring.entities.ResourceEntity;
import resourcingproblem.spring.exceptions.RemoteServiceException;
import resourcingproblem.spring.xstream.Opening;
import resourcingproblem.spring.xstream.Resource;
import resourcingproblem.spring.repository.ResourceRepository;
import resourcingproblem.spring.services.ResourceServcie;

/**
 * @author sudhanshusharma
 *
 */
@Service
public class ResourceServiceImpl implements ResourceServcie{
	
	private ResourceRepository resourceRepository;

	/**
	 * Get the available resources whose has skills mentioned in the opening
	 * 
	 * 
	 */
	@Override
	public List<Resource> getResourcesForOpening(Opening opening) throws RemoteServiceException {
		List<Resource> resources = null;
		List<ResourceEntity> resourceEntities = null;
		List<Resource> avaliableResources = new ArrayList<Resource>();
		
		try{
			//get available resources from H2 DB
			//can be replace with sorted Tree by available date of Resources
			//GC this tree once we finished with this task
			resourceEntities = resourceRepository.getAvailableResourcesOfOpening(opening.getProjectStartDate());
			
			//converter 
			resources = ResourceConverter.getResourceListFromResourceEntityList(resourceEntities);
			
			//check mandatory skills 
			for (Resource resource: resources){
				if(resource.getSkills().containsAll(opening.getMandatorySkills())){
					avaliableResources.add(resource);
				}
			}
				
		}catch(Exception e){
			 throw new RemoteServiceException(e.getMessage());
		}
		
		return avaliableResources;
	}

	@Override
	public List<Resource> getResourcesForOpening(Opening opening, List<Resource> resources)
			throws RemoteServiceException {
		//List<Resource> resources = null;
		//List<ResourceEntity> resourceEntities = null;
		List<Resource> avaliableResources = new ArrayList<Resource>();
		
		try{
			//get available resources from H2 DB
			//can be replace with sorted Tree by available date of Resources
			//GC this tree once we finished with this task
			//resourceEntities = resourceRepository.getAvailableResourcesOfOpening(opening.getProjectStartDate());
			
			//converter 
			//resources = ResourceConverter.getResourceListFromResourceEntityList(resourceEntities);
			
			//check mandatory skills 
			for (Resource resource: resources){
				if(resource.getSkills().containsAll(opening.getMandatorySkills())){
					avaliableResources.add(resource);
				}
			}
				
		}catch(Exception e){
			 throw new RemoteServiceException(e.getMessage());
		}
		
		return avaliableResources;
	}

}
