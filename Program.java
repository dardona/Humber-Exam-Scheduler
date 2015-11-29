/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduletest;

/**
 *
 * @author Danny Ardona
 */
public class Program {
    StudentGroupMap students;
    String programCode;
    String programName;
    
    public Program(StudentGroupMap students, String programCode, String programName){
        this.students = students;
        this.programCode = programCode;
        this.programName = programName;
    }
    
    public boolean setProgramCode(String programCode){
        this.programCode = programCode;
        return true;
    }
    
    public String getProgramCode(){
        return programCode;
    }
    
    public boolean setProgramName(String programName){
        this.programName = programName;
        return true;
    }
    
    public String getProgramName(){
        return programName;
    }
}
