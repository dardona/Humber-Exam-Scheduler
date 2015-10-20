
package humber.user;

import humber.courses.CourseMap;
import humber.exams.Exam;
import humber.exams.ExamMap;
import humber.programs.ProgramMap;
import humber.rooms.RoomMap;
import humber.schedule.Schedule;
import humber.schedule.Schedule.Day;
import humber.schedule.Schedule.Slot;
import humber.studentgroups.StudentGroupMap;

/*
 * 
 * Author: Cody Cottrell and Trevor Smart
 *
 */
public class Administrator extends Account {
    
    public Administrator(String username, String password) {
        super(username, password);
    }
    
    public boolean alterExam(Schedule schedule, Exam exam, Slot slot, Day day) {
        return true;
    }
    
    public boolean addTimeSlot(Schedule schedule, Slot slot, int startHour, int startMin, int endHour, int endMin) {
        return true;
    }
    
    public boolean removeTimeSlot(Schedule schedule, Slot slot) {
        return true;
    }
    
    public boolean alterExams(ExamMap exams) {
        return true;
    }
    
    public CourseMap getCourses() {
        return new CourseMap();
    }
    
    public boolean updateCourses(CourseMap courses) {
        return true;
    }
    
    public RoomMap getRooms() {
        return new RoomMap();
    }
    
    public boolean updateRooms(RoomMap rooms) {
        return true;
    }
    
    public ProgramMap getPrograms() {
        return new ProgramMap();
    }
    
    public boolean updatePrograms(ProgramMap programs) {
        return true;
    }
    
    public StudentGroupMap getStudentGroups() {
        return new StudentGroupMap();
    }
    
    public boolean updateStudentGroup(StudentGroupMap studentGroups) {
        return true;
    }
    
    public boolean changeUserPassword(String userName, String newPassword) {
        return true;
    }
    
    public boolean addUser(String username, String password) {
        return true;
    }
    
    public boolean deleteUser(String username) {
        return true;
    }
    
}
