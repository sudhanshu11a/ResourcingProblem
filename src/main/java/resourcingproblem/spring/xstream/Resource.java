package resourcingproblem.spring.xstream;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

import resourcingproblem.spring.converter.StringToListConverter;
import resourcingproblem.spring.dto.Skill;

@XStreamAlias("record")
public class Resource implements Serializable,XStreamObject {

    /**
     * 
     */
    private static final long serialVersionUID = 648473801320585040L;

    @XStreamAlias("EmployeeID")
    private Integer employeeID;

    @XStreamAlias("DOJ")
    private Date doj;

    @XStreamAlias("Skills")
    @XStreamConverter(StringToListConverter.class)
    private List<Skill> skills;

    @XStreamAlias("DomainExperience")
    private String domainExperience;

    @XStreamAlias("Rating")
    private String rating;

    @XStreamAlias("CommunicationsRating")
    private String communicationsRating;

    @XStreamAlias("NAGP")
    private Boolean nAGP;

    @XStreamAlias("YearsOfExperience")
    private Integer yearsOfExperience;

    @XStreamAlias("CurrentRole")
    private String currentRole;

    @XStreamAlias("PreviousCustomerExperience")
    private String previousCustomerExperience;

    @XStreamAlias("AvailableFromDate")
    private Date availableFromDate;

    @XStreamAlias("Costperhour")
    private Integer costperhour;

    @XStreamAlias("Certifications")
    private String certifications;

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

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
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
