package br.wellcare.controller;

import br.wellcare.model.Appointment;
import br.wellcare.service.AppointmentService;

import java.util.List;

public class AppointmentController {

    private final AppointmentService appointmentService = new AppointmentService();

    public Appointment schedule(int patientId, int doctorId, String date, String reason) {
        return appointmentService.schedule(patientId, doctorId, date);
    }

    public void cancel(int id) {
        appointmentService.cancelAppointment(id);
    }

    public void reschedule(int id, String newDate) {
        appointmentService.rescheduleAppointment(id, newDate);
    }

    public List<Appointment> listAppointments() {
        return appointmentService.findAll();
    }

    public Appointment findAppointment(int id) {
        return appointmentService.findById(id);
    }

    public void printAppointments() {
        appointmentService.findAll().forEach(System.out::println);
    }
}
