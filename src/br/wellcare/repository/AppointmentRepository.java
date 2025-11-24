package br.wellcare.repository;

import br.wellcare.model.Appointment;
import java.util.ArrayList;
import java.util.List;

public class AppointmentRepository {
    private List<Appointment> appointments = new ArrayList<>();

    public void save(Appointment a) { appointments.add(a); }

    public Appointment findById(int id) {
        return appointments.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }
}
