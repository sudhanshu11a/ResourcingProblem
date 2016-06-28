package resourcingproblem.spring.xstream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import resourcingproblem.spring.xstream.Resource;

@XStreamAlias("resource-data")
public class CompanyResources implements Serializable, XStreamObject {

    /**
     * 
     */
    private static final long serialVersionUID = 2249066560522226823L;

    @XStreamImplicit(itemFieldName = "record")
    List<Resource> resourceList = new ArrayList<Resource>();

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

}
