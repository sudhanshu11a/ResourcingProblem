package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("resource-data")
public class CompanyOpenings implements Serializable {

    /**
     * @author Sudhanshu
     */
    private static final long serialVersionUID = 8477905948971044103L;

    @XStreamImplicit(itemFieldName = "record")
    List<Opening> openingList = new ArrayList<Opening>();

    public List<Opening> getOpeningList() {
        return openingList;
    }

    public void setOpeningList(List<Opening> openingList) {
        this.openingList = openingList;
    }

}
