package resourcingproblem.spring.xstream;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

import resourcingproblem.spring.converter.StringToListConverter;
import resourcingproblem.spring.dto.Skill;

@XStreamAlias("record")
public class Opening implements Serializable,XStreamObject {

    /**
     * @author ankur
     */
    private static final long serialVersionUID = -1408243940023119126L;

    @XStreamAlias("RequestID")
    private String requestID;

    @XStreamAlias("ClientKey")
    private String clientKey;

    @XStreamAlias("ProjectKey")
    private String projectKey;

    @XStreamAlias("CustomerName")
    private String customerName;

    @XStreamAlias("ProjectName")
    private String projectName;

    @XStreamAlias("IsKeyProject")
    private Boolean isKeyProject;

    @XStreamAlias("ProjectDomain")
    private String projectDomain;

    @XStreamAlias("ProjectStartDate")
    private Date projectStartDate;

    @XStreamAlias("ProjectEndDate")
    private Date projectEndDate;

    @XStreamAlias("Role")
    private String role;

    @XStreamAlias("IsKeyPosition")
    private Boolean isKeyPosition;

    @XStreamAlias("YearsOfExperience")
    private Integer yearsOfExperience;

    @XStreamAlias("MandatorySkills")
    @XStreamConverter(StringToListConverter.class)
    private List<Skill> mandatorySkills;

    @XStreamAlias("ClientCommunication")
    private Boolean cientCommunication;

    @XStreamAlias("RequestStartDate")
    private Date requestStartDate;

    @XStreamAlias("AllocationEndDate")
    private Date allocationEndDate;

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

	public List<Skill> getMandatorySkills() {
		return mandatorySkills;
	}

	public void setMandatorySkills(List<Skill> mandatorySkills) {
		this.mandatorySkills = mandatorySkills;
	}

	public void setKeyProject(Boolean isKeyProject) {
		this.isKeyProject = isKeyProject;
	}

	public void setKeyPosition(Boolean isKeyPosition) {
		this.isKeyPosition = isKeyPosition;
	}

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
