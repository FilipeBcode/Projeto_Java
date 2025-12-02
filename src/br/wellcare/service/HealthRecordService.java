package br.wellcare.service;

import br.wellcare.model.HealthRecord;
import br.wellcare.repository.HealthRecordRepository;
import br.wellcare.util.IdGenerator;

public class HealthRecordService {

    private HealthRecordRepository repo = new HealthRecordRepository();

    public HealthRecord createRecord(int userId, String condition, String recommendation) {
        HealthRecord record = new HealthRecord(
                IdGenerator.generate(),
                userId,
                condition,
                recommendation
        );
        repo.save(record);
        return record;
    }

    public java.util.List<HealthRecord> findAll() {
        return repo.findAll();
    }

    public java.util.List<HealthRecord> findByUserId(int userId) {
        // repository exposes a single findByUserId which returns the first match; keep compatibility
        HealthRecord r = repo.findByUserId(userId);
        if (r == null) return new java.util.ArrayList<>();
        java.util.List<HealthRecord> list = new java.util.ArrayList<>();
        list.add(r);
        return list;
    }

    public HealthRecord findById(int id) {
        return repo.findById(id);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
