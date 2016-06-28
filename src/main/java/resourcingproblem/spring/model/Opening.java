package resourcingproblem.spring.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

import resourcingproblem.spring.converter.StringToListConverter;

@XStreamAlias("record")
public class Opening implements Serializable {

    /**
     * @author ankur
     */
    private static final long serialVersionUID = -1408243940023119126L;

    @XStreamAlias("RequestID")
    public String requestID;

    @XStreamAlias("ClientKey")
    public String clientKey;

    @XStreamAlias("ProjectKey")
    public String projectKey;

    @XStreamAlias("CustomerName")
    public String customerName;

    @XStreamAlias("ProjectName")
    public String projectName;

    @XStreamAlias("IsKeyProject")
    public boolean isKeyProject;

    @XStreamAlias("ProjectDomain")
    public String projectDomain;

    @XStreamAlias("ProjectStartDate")
    public Date projectStartDate;

    @XStreamAlias("ProjectEndDate")
    public Date projectEndDate;

    @XStreamAlias("Role")
    public String role;

    @XStreamAlias("IsKeyPosition")
    public boolean isKeyPosition;

    @XStreamAlias("YearsOfExperience")
    public Integer yearsOfExperience;

    @XStreamAlias("MandatorySkills")
    @XStreamConverter(StringToListConverter.class)
    public List<MatchingSkillAndLevel> mandatorySkills;

    @XStreamAlias("ClientCommunication")
    public boolean cientCommunication;

    @XStreamAlias("RequestStartDate")
    public Date requestStartDate;

    @XStreamAlias("AllocationEndDate")
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

    public boolean getIsKeyProject() {
        return isKeyProject;
    }

    public void setIsKeyProject(boolean isKeyProject) {
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

    public boolean getIsKeyPosition() {
        return isKeyPosition;
    }

    public void setIsKeyPosition(boolean isKeyPosition) {
        this.isKeyPosition = isKeyPosition;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

	public List<MatchingSkillAndLevel> getMandatorySkills() {
		return mandatorySkills;
	}

	public void setMandatorySkills(List<MatchingSkillAndLevel> mandatorySkills) {
		this.mandatorySkills = mandatorySkills;
	}

	public void setKeyProject(boolean isKeyProject) {
		this.isKeyProject = isKeyProject;
	}

	public void setKeyPosition(boolean isKeyPosition) {
		this.isKeyPosition = isKeyPosition;
	}

	public boolean getCientCommunication() {
        return cientCommunication;
    }

    public void setCientCommunication(boolean cientCommunication) {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((clientKey == null) ? 0 : clientKey.hashCode());
        result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
        result = prime * result + ((projectDomain == null) ? 0 : projectDomain.hashCode());
        result = prime * result + ((projectEndDate == null) ? 0 : projectEndDate.hashCode());
        result = prime * result + ((projectKey == null) ? 0 : projectKey.hashCode());
        result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
        result = prime * result + ((projectStartDate == null) ? 0 : projectStartDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Opening other = (Opening) obj;
        if (clientKey == null) {
            if (other.clientKey != null)
                return false;
        } else if (!clientKey.equals(other.clientKey))
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        } else if (!customerName.equals(other.customerName))
            return false;
        if (projectDomain == null) {
            if (other.projectDomain != null)
                return false;
        } else if (!projectDomain.equals(other.projectDomain))
            return false;
        if (projectEndDate == null) {
            if (other.projectEndDate != null)
                return false;
        } else if (!projectEndDate.equals(other.projectEndDate))
            return false;
        if (projectKey == null) {
            if (other.projectKey != null)
                return false;
        } else if (!projectKey.equals(other.projectKey))
            return false;
        if (projectName == null) {
            if (other.projectName != null)
                return false;
        } else if (!projectName.equals(other.projectName))
            return false;
        if (projectStartDate == null) {
            if (other.projectStartDate != null)
                return false;
        } else if (!projectStartDate.equals(other.projectStartDate))
            return false;
        return true;
    }

}
