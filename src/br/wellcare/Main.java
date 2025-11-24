package br.wellcare;

import br.wellcare.model.Appointment;
import br.wellcare.model.HealthRecord;
import br.wellcare.model.User;
import br.wellcare.model.enums.UserType;
import br.wellcare.service.*;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        HealthRecordService healthService = new HealthRecordService();
        AppointmentService appointmentService = new AppointmentService();
        ReportService reportService = new ReportService();

        System.out.println("===== WELCARE SYSTEM: SIMULAÇÃO COMPLETA =====");

        // Cadastro de usuários
        User ana = userService.createUser("Ana Silva", 28, UserType.PACIENTE);
        User drJoao = userService.createUser("Dr. João", 45, UserType.MEDICO);

        // Registro de saúde
        HealthRecord recordAna = healthService.createRecord(
                ana.getId(), "Sedentarismo", "Aumentar atividades físicas"
        );

        // Marcar consulta
        Appointment consulta = appointmentService.schedule(
                ana.getId(),
                drJoao.getId(),
                "2025-02-10 14:00"
        );

        // Finalizar consulta
        appointmentService.finishAppointment(
                consulta.getId(),
                "Paciente orientada sobre rotina saudável."
        );

        // Gerar relatório completo do sistema
        reportService.generateUserReport(ana);
        reportService.generateHealthReport(recordAna);
        reportService.generateAppointmentReport(consulta);

        System.out.println("===== FIM DA SIMULAÇÃO =====");
    }
}
