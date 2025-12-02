package br.wellcare.controller;

import br.wellcare.model.Appointment;
import br.wellcare.model.HealthRecord;
import br.wellcare.model.Report;
import br.wellcare.model.User;
import br.wellcare.service.ReportService;

import java.util.List;

public class ReportController {

    private final ReportService reportService = new ReportService();

    public Report generateFromUser(User u) {
        return reportService.generateUserReport(u);
    }

    public Report generateFromRecord(HealthRecord hr) {
        return reportService.generateHealthReport(hr);
    }

    public Report generateFromAppointment(Appointment a) {
        return reportService.generateAppointmentReport(a);
    }

    public void printReport(int id) {
        Report r = reportService.findById(id);
        reportService.printReport(r);
    }

    public List<Report> listReports() {
        return reportService.findAll();
    }

    public void delete(int id) {
        reportService.delete(id);
    }
}
