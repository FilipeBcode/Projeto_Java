package br.wellcare.model;

import br.wellcare.model.enums.AppointmentStatus;

public class Appointment {
    private int id;
    private int patientId;
    private int doctorId;
    private String date;
    private AppointmentStatus status;
    private String notes;

    public Appointment(int id, int patientId, int doctorId, String date) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.status = AppointmentStatus.SCHEDULED;
    }

    public int getId() { return id; }
    public int getPatientId() { return patientId; }
    public int getDoctorId() { return doctorId; }
    public String getDate() { return date; }
    public AppointmentStatus getStatus() { return status; }
    public String getNotes() { return notes; }

    public void finish(String notes) {
        this.status = AppointmentStatus.FINISHED;
        this.notes = notes;
    }

    public void cancel() {
        this.status = AppointmentStatus.CANCELED;
    }

    public void reschedule(String newDate) {
        this.date = newDate;
    }

    @Override
    public String toString() {
        return "Appointment { id=" + id + ", patientId=" + patientId +
                ", doctorId=" + doctorId + ", date='" + date +
                "', status=" + status + ", notes='" + notes + "' }";
    }
}
