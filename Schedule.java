
package humber.schedule;

import humber.exams.Exam;
import humber.exams.ExamMap;
import java.util.Map;
/*
 *
 * Author: Cody Cottrell
 *
 */
public class Schedule {
    
    public enum Day { Mon, Tues, Wed, Thurs, Fri, Sat };
    public enum Slot { A, B, C, D, E, F, G, H, I, J, K, L };
    
    private Map<Slot, ScheduleSlot> schedule;
    
    public Schedule() {
        
    }
    
    public boolean addExam(Slot slot, Day day, Exam exam) {
        return true;
    }
    
    public boolean removeExam(Slot slot, Day day, String examID) {
        return true;
    }
    
    public Exam getExam(Slot slot, Day day, String examID) {
        return new Exam();
    }
    
    public boolean addExams(Slot slot, Day day, ExamMap exams) {
        return true;
    }
    
    public boolean removeExams(Slot slot, Day day) {
        return true;
    }
    
    public ExamMap getExams(Slot slot, Day day) {
    	return new ExamMap();    
    }
    
    public boolean removeTimeSlot(Slot slot) {
        return true;
    }
    
    public boolean addTimeSlot(Slot slot, int startHour, int startMin, int endHour, int endMin) {
        return true;
    }
    
    public boolean changeSlotStartTime(Slot slot, int numOfHours, int numOfMin) {
        return true;
    }
    
    public boolean changeSlotEndTime(Slot slot, int numOfHours, int numOfMin) {
        return true;
    }

    public String getSlotTime(Slot slot) {
	return "";
    }	
    
}
