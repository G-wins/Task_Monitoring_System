package com.company.taskmonitoringsystem.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum Event implements EnumClass<Integer> {
    EMAIL(10),
    CHAT(20),
    EMAILORCHAT(30);


    private final Integer id;

    Event(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Event fromId(Integer id) {
        for (Event at : Event.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}