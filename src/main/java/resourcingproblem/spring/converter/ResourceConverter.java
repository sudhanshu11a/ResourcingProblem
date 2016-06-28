/**
 * 
 */
package resourcingproblem.spring.converter;

import java.util.ArrayList;
import java.util.List;

import resourcingproblem.spring.entities.ResourceEntity;
import resourcingproblem.spring.model.Resource;

/**
 * @author sudhanshusharma
 *
 */
public class ResourceConverter {
	
	public static Resource getResourceFromResourceEntity(ResourceEntity resourceEntity){
		Resource resource = new Resource();
		return resource;
	}

	public static List<Resource> getResourceListFromResourceEntityList(List<ResourceEntity> resourceEntities){
		List<Resource> resources = new ArrayList<>();
		return resources;
	}
	public static ResourceEntity getResourceEntityFromResource(Resource resource){
		ResourceEntity resourceEntity = new ResourceEntity();
		return resourceEntity;
	}
	public static List<ResourceEntity> getResourceEntityListFromResourceList(List<Resource> resources){
		List<ResourceEntity> resourceEntities = new ArrayList<>();
		return resourceEntities;
	}
}
