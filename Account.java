
package humber.user;

import humber.exams.ExamMap;
import humber.schedule.Schedule;

/*
 *
 * Author: Cody Cottrell
 *
 */
public abstract class Account {
    
    private String username;
    private String password;
    
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public Schedule getSchedule() {
        return new Schedule();
    }
    
    public ExamMap getExams() {
        return new ExamMap();
    }
    
}
