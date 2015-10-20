
package humber.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/*
 *
 * Author: Danny Ardona
 *
 */
public class ProgramMap {
    
    private Map<String, Program> programs;

    public ProgramMap() {
    
    }
    
    public boolean addProgram(String programCode, Program program) {
        return true;
    }
    
    public boolean removeProgram(String programCode) {
        return true;
    }
    
    public Iterator getPrograms() {
        return new ArrayList<>().iterator();
    }
    
    public Program getProgram(String programCode) {
        return new Program("","");
    }
    
    
}
