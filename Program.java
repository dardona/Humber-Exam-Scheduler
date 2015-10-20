
package humber.programs;

import humber.studentgroups.StudentGroup;
import humber.studentgroups.StudentGroupMap;
import java.util.ArrayList;
import java.util.Iterator;
/*
 *
 * Author: Danny Ardona
 *
 */
public class Program {
    
    private String programCode;
    private String programName;

    public Program(String programCode, String programName) {
        this.programCode = programCode;
        this.programName = programName;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
    
    public Iterator getStudentGroups() {
        return new ArrayList<>().iterator();
    }
    
    
    
}
