
package humber.courses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/*
 *
 * Author: Mariah Fernandes
 *
 */
public class CourseMap {
    
    private Map<String, Course> courses;
    
    public CourseMap() {
        
    }
    
    public boolean addCourse(Course course) {
        return true;
    }
    
    public boolean removeCourse(String CourseID) {
        return true;
    }
    
    public Iterator getCourse() {
        return new ArrayList<>().iterator();
    }
    
}
