package br.wellcare.controller;

import br.wellcare.model.HealthRecord;
import br.wellcare.service.HealthRecordService;

import java.util.List;

public class HealthRecordController {

    private final HealthRecordService healthRecordService = new HealthRecordService();

    public HealthRecord addRecord(int userId, String condition, String recommendation) {
        return healthRecordService.createRecord(userId, condition, recommendation);
    }

    public List<HealthRecord> listRecords() {
        return healthRecordService.findAll();
    }

    public List<HealthRecord> listByUser(int userId) {
        return healthRecordService.findByUserId(userId);
    }

    public HealthRecord findRecord(int id) {
        return healthRecordService.findById(id);
    }

    public void deleteRecord(int id) {
        healthRecordService.delete(id);
    }

    public void printAllRecords() {
        healthRecordService.findAll().forEach(System.out::println);
    }
}
