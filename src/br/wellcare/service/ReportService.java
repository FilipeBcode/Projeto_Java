package br.wellcare.service;

import br.wellcare.model.Appointment;
import br.wellcare.model.HealthRecord;
import br.wellcare.model.User;

public class ReportService {

    public void generateUserReport(User u) {
        System.out.println("\n--- RELATÓRIO DE USUÁRIO ---");
        System.out.println(u);
    }

    public void generateHealthReport(HealthRecord hr) {
        System.out.println("\n--- RELATÓRIO DE SAÚDE ---");
        System.out.println(hr);
    }

    public void generateAppointmentReport(Appointment a) {
        System.out.println("\n--- RELATÓRIO DE CONSULTA ---");
        System.out.println(a);
    }
}
