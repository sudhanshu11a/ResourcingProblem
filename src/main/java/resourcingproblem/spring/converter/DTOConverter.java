/**
 * 
 */
package resourcingproblem.spring.converter;

/**
 * @author sudhanshusharma
 *
 */
public interface DTOConverter {
	
	<E extends Object> E getEntityFromDTO(E dto);
	
	<T extends Object> T getDTOFromEntity(T entity );
	

}
