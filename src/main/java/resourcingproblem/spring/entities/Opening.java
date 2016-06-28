/**
 * 
 */
package resourcingproblem.spring.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import resourcingproblem.spring.dto.Skill;

/**
 * @author sudhanshusharma
 *
 */
@Entity
@Table(name = "opening")
public class Opening {

	    public String requestID;

	    public String clientKey;

	    public String projectKey;

	    public String customerName;

	    public String projectName;

	    public Boolean isKeyProject;

	    public String projectDomain;

	    public Date projectStartDate;

	    public Date projectEndDate;

	    public String role;

	    public Boolean isKeyPosition;

	    public Integer yearsOfExperience;

	   // public List<Skill> mandatorySkills;

	    public Boolean cientCommunication;

	    public Date requestStartDate;

	    public Date allocationEndDate;
}
