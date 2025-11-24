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
}
