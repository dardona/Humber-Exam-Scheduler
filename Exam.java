
package humber.exams;

import humber.courses.Course;
import humber.rooms.Room;
import org.joda.time.LocalTime;
import java.util.Date;
/*
 *
 * Author: Paras Prajapati
 *
 */
public class Exam {
    
    private String examID;
    private Date date;
    private LocalTime startTime;
    private LocalTime endTime;
    
    public Exam() {
        
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public String getDate() {
        return date.toString();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime.toString();
    }

    public void setStartTime(int startHour, int startMin) {
        this.startTime = new LocalTime(startHour, startMin);
    }

    public String getEndTime() {
        return endTime.toString();
    }

    public void setEndTime(int endHour, int endMin) {
        this.endTime = new LocalTime(endHour, endMin);
    }
    
    
    
}
