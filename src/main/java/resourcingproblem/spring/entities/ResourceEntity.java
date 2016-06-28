/**
 * 
 */
package resourcingproblem.spring.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

import resourcingproblem.spring.converter.StringToListConverter;
import resourcingproblem.spring.dto.Skill;

/**
 * @author sudhanshusharma
 *
 */
@Entity
@Table(name="resource")
public class ResourceEntity extends BaseEntity{

	    public Integer employeeID;

	    @Temporal(TemporalType.DATE)
	    public Date doj;

	    //public List<Skill> skills;

	    public String domainExperience;

	    public String rating;

	    public String communicationsRating;

	    @Column(columnDefinition = "tinyint", nullable = false)
	    public Boolean nAGP;

	    public Integer yearsOfExperience;

	    public String currentRole;

	    public String previousCustomerExperience;

	    @Temporal(TemporalType.DATE)
	    public Date availableFromDate;

	    public Integer costperhour;

	    public String certifications;

		public Integer getEmployeeID() {
			return employeeID;
		}

		public void setEmployeeID(Integer employeeID) {
			this.employeeID = employeeID;
		}

		public Date getDoj() {
			return doj;
		}

		public void setDoj(Date doj) {
			this.doj = doj;
		}

		public String getDomainExperience() {
			return domainExperience;
		}

		public void setDomainExperience(String domainExperience) {
			this.domainExperience = domainExperience;
		}

		public String getRating() {
			return rating;
		}

		public void setRating(String rating) {
			this.rating = rating;
		}

		public String getCommunicationsRating() {
			return communicationsRating;
		}

		public void setCommunicationsRating(String communicationsRating) {
			this.communicationsRating = communicationsRating;
		}

		public Boolean getnAGP() {
			return nAGP;
		}

		public void setnAGP(Boolean nAGP) {
			this.nAGP = nAGP;
		}

		public Integer getYearsOfExperience() {
			return yearsOfExperience;
		}

		public void setYearsOfExperience(Integer yearsOfExperience) {
			this.yearsOfExperience = yearsOfExperience;
		}

		public String getCurrentRole() {
			return currentRole;
		}

		public void setCurrentRole(String currentRole) {
			this.currentRole = currentRole;
		}

		public String getPreviousCustomerExperience() {
			return previousCustomerExperience;
		}

		public void setPreviousCustomerExperience(String previousCustomerExperience) {
			this.previousCustomerExperience = previousCustomerExperience;
		}

		public Date getAvailableFromDate() {
			return availableFromDate;
		}

		public void setAvailableFromDate(Date availableFromDate) {
			this.availableFromDate = availableFromDate;
		}

		public Integer getCostperhour() {
			return costperhour;
		}

		public void setCostperhour(Integer costperhour) {
			this.costperhour = costperhour;
		}

		public String getCertifications() {
			return certifications;
		}

		public void setCertifications(String certifications) {
			this.certifications = certifications;
		}
	    
	    
}
