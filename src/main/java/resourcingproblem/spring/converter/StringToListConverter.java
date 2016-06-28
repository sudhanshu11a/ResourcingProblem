package resourcingproblem.spring.converter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.thoughtworks.xstream.converters.SingleValueConverter;

import resourcingproblem.spring.model.MatchingSkillAndLevel;

public class StringToListConverter implements SingleValueConverter{

	@Override
	public boolean canConvert(Class type) {
		return List.class.isAssignableFrom(type);
	}

	@Override
	public String toString(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object fromString(String str) {
		Collection<MatchingSkillAndLevel> collection = new ArrayList<MatchingSkillAndLevel>();
        String[] mandSkills = str.split(", ");
        for (String mandSkill:mandSkills) {
        	String[] SKillLevel =mandSkill.split("-");
        	MatchingSkillAndLevel skillAndLevel=new MatchingSkillAndLevel();
        	skillAndLevel.setSkill(SKillLevel[0]);
        	skillAndLevel.setLevel(SKillLevel[1]);
        	collection.add(skillAndLevel);
        }
        return collection;
	}

}
