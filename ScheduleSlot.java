
package humber.schedule;

import humber.exams.Exam;
import humber.exams.ExamMap;
import humber.schedule.Schedule.Day;
import java.time.LocalTime;
import java.util.Map;

/*
 *
 * Author: Cody Cottrell 
 *
 */
public class ScheduleSlot {
    
    private LocalTime startTime, endTime;
    private Map<Day, ExamMap> subSlots;
    
    protected ScheduleSlot(int startHour, int startMin, int endHour, int endMin) {
        
    }
    
    public boolean addExam(Day day, Exam exam) {
    	return true;    
    }
    
    public boolean removeExam(Day day, String examID) {
    	return true;    
    }
    
    public Exam getExam(Day day, String examID) {
    	return new Exam();    
    }
    
    public boolean addExams(Day day, ExamMap exams) {
    	return true;
    }
    
    public boolean removeExams(Day day) {
    	return true;    
    }
    
    public ExamMap getExams(Day day) {
        return subSlots.get(day);
    }
    
    public String getStartTime() {
    	return "";    
    }
    
    public String getEndTime() {
    	return "";    
    }
    
    public boolean changeStartTime(int numOfHours, int numOfMin) {
    	return true;   
    }
    
    public boolean changeEndTime(int numOfHours, int numOfMin) {
    	return true;    
    }    
    
}
