
package humber.user;

import humber.exams.Exam;
import humber.schedule.Schedule;
import humber.schedule.Schedule.Day;
import humber.schedule.Schedule.Slot;

/*
 *
 * Author: Richard Tran
 *
 */
public class User extends Account {

    public User(String username, String password) {
        super(username, password);
    }
    
    public boolean scheduleExam(Schedule schedule, Exam exam, Slot slot, Day day) {
        return true;
    }
    
    public boolean removeExam(Schedule schedule, Exam exam, Slot slot, Day day) {
        return true;
    }
    
    public boolean changePassword(String oldPassword, String newPassword) {
        return true;
    }
    
}
