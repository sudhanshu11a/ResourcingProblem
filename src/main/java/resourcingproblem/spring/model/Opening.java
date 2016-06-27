package resourcingproblem.spring.model;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

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
    public String isKeyProject;

    @XStreamAlias("ProjectDomain")
    public String projectDomain;

    @XStreamAlias("ProjectStartDate")
    public String projectStartDate;

    @XStreamAlias("ProjectEndDate")
    public String projectEndDate;

    @XStreamAlias("Role")
    public String role;

    @XStreamAlias("IsKeyPosition")
    public String isKeyPosition;

    @XStreamAlias("YearsOfExperience")
    public Integer yearsOfExperience;

    @XStreamAlias("MandatorySkills")
    public String mandatorySkills;

    @XStreamAlias("ClientCommunication")
    public String cientCommunication;

    @XStreamAlias("RequestStartDate")
    public String requestStartDate;

    @XStreamAlias("AllocationEndDate")
    public String allocationEndDate;

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

    public String getIsKeyProject() {
        return isKeyProject;
    }

    public void setIsKeyProject(String isKeyProject) {
        this.isKeyProject = isKeyProject;
    }

    public String getProjectDomain() {
        return projectDomain;
    }

    public void setProjectDomain(String projectDomain) {
        this.projectDomain = projectDomain;
    }

    public String getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(String projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public String getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(String projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIsKeyPosition() {
        return isKeyPosition;
    }

    public void setIsKeyPosition(String isKeyPosition) {
        this.isKeyPosition = isKeyPosition;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getMandatorySkills() {
        return mandatorySkills;
    }

    public void setMandatorySkills(String mandatorySkills) {
        this.mandatorySkills = mandatorySkills;
    }

    public String getCientCommunication() {
        return cientCommunication;
    }

    public void setCientCommunication(String cientCommunication) {
        this.cientCommunication = cientCommunication;
    }

    public String getRequestStartDate() {
        return requestStartDate;
    }

    public void setRequestStartDate(String requestStartDate) {
        this.requestStartDate = requestStartDate;
    }

    public String getAllocationEndDate() {
        return allocationEndDate;
    }

    public void setAllocationEndDate(String allocationEndDate) {
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
