package com.company.beans;

import java.util.Date;

/**
 * Created by kumavatj on 5/27/17.
 */
public class Meeting {
    private String description;
    private Date startTime;
    private Date endTime;

    private int attendeesCount;
    private String scheduler;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getAttendeesCount() {
        return attendeesCount;
    }

    public void setAttendeesCount(int attendeesCount) {
        this.attendeesCount = attendeesCount;
    }

    public String getScheduler() {
        return scheduler;
    }

    public void setScheduler(String scheduler) {
        this.scheduler = scheduler;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "description='" + description + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", attendeesCount=" + attendeesCount +
                ", scheduler='" + scheduler + '\'' +
                '}';
    }
}
