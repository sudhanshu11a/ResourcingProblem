/**
 * 
 */
package resourcingproblem.spring.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author sudhanshusharma
 *
 */
@Entity
@Table(name = "opening")
public class OpeningEntity {

	    public String requestID;

	    public String clientKey;

	    public String projectKey;

	    public String customerName;

	    public String projectName;

	    @Column(columnDefinition = "tinyint", nullable = false)
//	    @Column(name=)
	    public Boolean isKeyProject;

	    public String projectDomain;

	    @Temporal(TemporalType.DATE)
	    public Date projectStartDate;

	    @Temporal(TemporalType.DATE)
	    public Date projectEndDate;

	    public String role;

	    @Column(columnDefinition = "tinyint", nullable = false)
	    public Boolean isKeyPosition;

	    public Integer yearsOfExperience;
	    
	 //   @OneToMany(fetch = FetchType.LAZY)
	   /// @JoinColumn(name="mandatory_skills", referencedColumnName = "id")
	    //public List<SkillEntity> mandatorySkills;

	    @Column(columnDefinition = "tinyint", nullable = false)
	    public Boolean cientCommunication;

	    @Temporal(TemporalType.DATE)
	    public Date requestStartDate;

	    @Temporal(TemporalType.DATE)
	    public Date allocationEndDate;

		public String getRequestID() {
			return requestID;
		}

		public void setRequestID(String requestID) {
			this.requestID = requestID;
		}

		public String getClientKey() {
			return clientKey;
		}

		public void setClientKey(String clientKey) {
			this.clientKey = clientKey;
		}

		public String getProjectKey() {
			return projectKey;
		}

		public void setProjectKey(String projectKey) {
			this.projectKey = projectKey;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public Boolean getIsKeyProject() {
			return isKeyProject;
		}

		public void setIsKeyProject(Boolean isKeyProject) {
			this.isKeyProject = isKeyProject;
		}

		public String getProjectDomain() {
			return projectDomain;
		}

		public void setProjectDomain(String projectDomain) {
			this.projectDomain = projectDomain;
		}

		public Date getProjectStartDate() {
			return projectStartDate;
		}

		public void setProjectStartDate(Date projectStartDate) {
			this.projectStartDate = projectStartDate;
		}

		public Date getProjectEndDate() {
			return projectEndDate;
		}

		public void setProjectEndDate(Date projectEndDate) {
			this.projectEndDate = projectEndDate;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Boolean getIsKeyPosition() {
			return isKeyPosition;
		}

		public void setIsKeyPosition(Boolean isKeyPosition) {
			this.isKeyPosition = isKeyPosition;
		}

		public Integer getYearsOfExperience() {
			return yearsOfExperience;
		}

		public void setYearsOfExperience(Integer yearsOfExperience) {
			this.yearsOfExperience = yearsOfExperience;
		}

	/*	public List<SkillEntity> getMandatorySkills() {
			return mandatorySkills;
		}

		public void setMandatorySkills(List<SkillEntity> mandatorySkills) {
			this.mandatorySkills = mandatorySkills;
		}
*/
		public Boolean getCientCommunication() {
			return cientCommunication;
		}

		public void setCientCommunication(Boolean cientCommunication) {
			this.cientCommunication = cientCommunication;
		}

		public Date getRequestStartDate() {
			return requestStartDate;
		}

		public void setRequestStartDate(Date requestStartDate) {
			this.requestStartDate = requestStartDate;
		}

		public Date getAllocationEndDate() {
			return allocationEndDate;
		}

		public void setAllocationEndDate(Date allocationEndDate) {
			this.allocationEndDate = allocationEndDate;
		}
	    
	    
	    
	    
}
