package resourcingproblem.spring.model;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("record")
public class Resource implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 648473801320585040L;

    @XStreamAlias("EmployeeID")
    public String employeeID;

    @XStreamAlias("DOJ")
    public String doj;

    @XStreamAlias("Skills")
    public String skills;

    @XStreamAlias("DomainExperience")
    public String domainExperience;

    @XStreamAlias("Rating")
    public String rating;

    @XStreamAlias("CommunicationsRating")
    public String communicationsRating;

    @XStreamAlias("NAGP")
    public String nAGP;

    @XStreamAlias("YearsOfExperience")
    public Integer yearsOfExperience;

    @XStreamAlias("CurrentRole")
    public String currentRole;

    @XStreamAlias("PreviousCustomerExperience")
    public String previousCustomerExperience;

    @XStreamAlias("AvailableFromDate")
    public String availableFromDate;

    @XStreamAlias("Costperhour")
    public Integer costperhour;

    @XStreamAlias("Certifications")
    public String certifications;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
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

    public String getnAGP() {
        return nAGP;
    }

    public void setnAGP(String nAGP) {
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

    public String getAvailableFromDate() {
        return availableFromDate;
    }

    public void setAvailableFromDate(String availableFromDate) {
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
