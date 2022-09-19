package com.solvd.hospital.models.schedules;

import java.sql.Date;

public class Schedule {
    private int id;
    private Date start;
    private Date end;
    private int doctorId;

    public Schedule() {
    }

    public Schedule(int id, Date start, Date end, int doctorId) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.doctorId = doctorId;
    }

    public Schedule(Date start, Date end, int doctorId) {
        this.start = start;
        this.end = end;
        this.doctorId = doctorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", start=" + start +
                ", end=" + end +
                ", doctorId=" + doctorId +
                '}';
    }
}
