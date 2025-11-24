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
}
