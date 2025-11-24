package br.wellcare.model;

public class HealthRecord {
    private int id;
    private int userId;
    private String condition;
    private String recommendation;

    public HealthRecord(int id, int userId, String condition, String recommendation) {
        this.id = id;
        this.userId = userId;
        this.condition = condition;
        this.recommendation = recommendation;
    }

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public String getCondition() { return condition; }
    public String getRecommendation() { return recommendation; }

    @Override
    public String toString() {
        return "HealthRecord { id=" + id + ", userId=" + userId +
                ", condition='" + condition + "', recommendation='" + recommendation + "' }";
    }
}
