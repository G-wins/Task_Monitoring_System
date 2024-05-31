package com.company.taskmonitoringsystem.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "TASK_")
@Entity(name = "Task_")
public class Task {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "EVENT")
    private Integer event;

    @Column(name = "TOPIC")
    private String topic;

    @Column(name = "DATE")
    private LocalDate date;

    @Column(name = "DISCUSSION")
    private String discussion;

    @Column(name = "DELIVERABLE")
    private String deliverable;

    @InstanceName
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "RESPONSIBLE")
    private String responsible;

    @Column(name = "COPIED_IN")
    private String copiedIn;

    @Column(name = "DUE_DATE")
    private LocalDate dueDate;

    @Column(name = "DURATION")
    private String duration;

    @Column(name = "STATUS")
    private Integer status;

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getCopiedIn() {
        return copiedIn;
    }

    public void setCopiedIn(String copiedIn) {
        this.copiedIn = copiedIn;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeliverable() {
        return deliverable;
    }

    public void setDeliverable(String deliverable) {
        this.deliverable = deliverable;
    }

    public String getDiscussion() {
        return discussion;
    }

    public void setDiscussion(String discussion) {
        this.discussion = discussion;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Event getEvent() {
        return event == null ? null : Event.fromId(event);
    }

    public void setEvent(Event event) {
        this.event = event == null ? null : event.getId();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}