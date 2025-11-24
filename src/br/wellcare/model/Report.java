package br.wellcare.model;

import java.time.LocalDateTime;

public class Report {
    private int id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String sourceType;   // ex: "USER", "HEALTH_RECORD", "APPOINTMENT"
    private int sourceId;        // id da entidade origem

    public Report(int id, String title, String content, String sourceType, int sourceId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.sourceType = sourceType;
        this.sourceId = sourceId;
        this.createdAt = LocalDateTime.now();
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public String getSourceType() { return sourceType; }
    public int getSourceId() { return sourceId; }

    @Override
    public String toString() {
        return "Report { id=" + id +
                ", title='" + title + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", sourceId=" + sourceId +
                ", createdAt=" + createdAt +
                ", content='" + content + '\'' +
                " }";
    }
}
