package br.wellcare.repository;

import br.wellcare.model.Report;

import java.util.ArrayList;
import java.util.List;

public class ReportRepository {

    private final List<Report> reports = new ArrayList<>();

    public void save(Report r) {
        reports.add(r);
    }

    public List<Report> findAll() {
        return new ArrayList<>(reports);
    }

    public Report findById(int id) {
        return reports.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        reports.removeIf(r -> r.getId() == id);
    }
}
