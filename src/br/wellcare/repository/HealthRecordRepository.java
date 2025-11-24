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
}
