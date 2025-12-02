package br.wellcare.repository;

import br.wellcare.model.HealthRecord;
import java.util.ArrayList;
import java.util.List;

public class HealthRecordRepository {
    private List<HealthRecord> records = new ArrayList<>();

    public void save(HealthRecord r) { records.add(r); }

    public HealthRecord findByUserId(int userId) {
        return records.stream().filter(r -> r.getUserId() == userId).findFirst().orElse(null);
    }

    public java.util.List<HealthRecord> findAll() { return records; }

    public HealthRecord findById(int id) {
        return records.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
    }

    public void deleteById(int id) { records.removeIf(r -> r.getId() == id); }
}
