/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduletest;

import com.database.config.DatabaseConnection;
import com.database.config.Result;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Danny Ardona
 */
public class Program {
    StudentGroupMap students;
    String programCode;
    String programName;
    
    public Program(){
        
    }
    
    public Program(String programCode, String programName){
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
    
    public void addProgram(){
        DatabaseConnection connection = DatabaseConnection.open();
        connection.addProgram(programCode, programName);
    }
    
    public void removeProgram(){
        DatabaseConnection connection = DatabaseConnection.open();
        connection.removeProgram(programCode);
    }
    
    public UserMap<Program> getMap() throws SQLException{
        UserMap<Program> programs = new UserMap<Program>();
        DatabaseConnection connection = DatabaseConnection.open();
        Result result = connection.getPrograms();
        
        while(result.hasNext()){
            ResultSet set = result.next();
            Program program = new Program(set.getString("program_code"), set.getString("program_name"));
            System.out.println(set.getString("program_code")  + ", " + set.getString("program_name"));
            //programs.put(program);
        }
        
        return programs;
    }
}
