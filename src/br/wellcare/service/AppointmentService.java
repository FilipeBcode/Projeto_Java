package br.wellcare.service;

import br.wellcare.model.Appointment;
import br.wellcare.repository.AppointmentRepository;
import br.wellcare.util.IdGenerator;

public class AppointmentService {

    private AppointmentRepository repo = new AppointmentRepository();

    public Appointment schedule(int patientId, int doctorId, String date) {
        Appointment a = new Appointment(IdGenerator.generate(), patientId, doctorId, date);
        repo.save(a);
        return a;
    }

    public void finishAppointment(int id, String notes) {
        Appointment a = repo.findById(id);
        if (a != null) {
            a.finish(notes);
        }
    }

    // Additional helper methods used by controllers
    public Appointment scheduleAppointment(int patientId, int doctorId, String date, String reason) {
        // reason currently not stored at scheduling time; return created appointment
        return schedule(patientId, doctorId, date);
    }

    public void cancelAppointment(int id) {
        Appointment a = repo.findById(id);
        if (a != null) {
            a.cancel();
        }
    }

    public void rescheduleAppointment(int id, String newDate) {
        Appointment a = repo.findById(id);
        if (a != null) {
            a.reschedule(newDate);
        }
    }

    public java.util.List<Appointment> findAll() {
        return repo.findAll();
    }

    public Appointment findById(int id) {
        return repo.findById(id);
    }
}
