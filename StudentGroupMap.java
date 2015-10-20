
package humber.studentgroups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/*
 *
 * Author: Justin Banton
 *
 */
public class StudentGroupMap {
    
    private Map<String, StudentGroup> studentGroups;

    public StudentGroupMap() {
        
    }
    
    public boolean addStudentGroup(StudentGroup studentGroup) {
        return true;
    }
    
    public boolean removeStudentGroup(String sectionID) {
        return true;
    }
    
    public Iterator getStudentGroups() {
        return new ArrayList<>().iterator();
    }
    
    public StudentGroup getStudentGroup(String sectionID) {
        return new StudentGroup("","");
    }

}
