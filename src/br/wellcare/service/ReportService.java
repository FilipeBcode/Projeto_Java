package br.wellcare.service;

import br.wellcare.model.Appointment;
import br.wellcare.model.HealthRecord;
import br.wellcare.model.Report;
import br.wellcare.model.User;
import br.wellcare.repository.ReportRepository;
import br.wellcare.util.IdGenerator;

public class ReportService {
    private final ReportRepository repo = new ReportRepository();

    public Report generateUserReport(User u) {
        Report r = new Report(IdGenerator.generate(), "User Report: " + u.getName(), u.toString(), "USER", u.getId());
        repo.save(r);
        return r;
    }

    public Report generateHealthReport(HealthRecord hr) {
        Report r = new Report(IdGenerator.generate(), "HealthRecord Report: " + hr.getId(), hr.toString(), "HEALTH_RECORD", hr.getId());
        repo.save(r);
        return r;
    }

    public Report generateAppointmentReport(Appointment a) {
        Report r = new Report(IdGenerator.generate(), "Appointment Report: " + a.getId(), a.toString(), "APPOINTMENT", a.getId());
        repo.save(r);
        return r;
    }

    public Report findById(int id) {
        return repo.findById(id);
    }

    public java.util.List<Report> findAll() {
        return repo.findAll();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

    public void printReport(Report r) {
        if (r == null) return;
        System.out.println("\n--- RELATÓRIO ---");
        System.out.println(r);
    }
}
