
package humber.studentgroups;

import humber.courses.CourseMap;
/*
 *
 * Author: Justin Banton
 *
 */
public class StudentGroup {
    
    private String sectionID;
    private String semester; 

    public StudentGroup(String sectionID, String semester) {
        this.sectionID = sectionID;
        this.semester = semester;
    }

    public String getSectionID() {
        return sectionID;
    }

    public void setSectionID(String sectionID) {
        this.sectionID = sectionID;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    
    
}
