package com.sergeykotov.testcasemanager.model;

import java.util.Objects;

public final class Group {
    private Long id;
    private Module module;
    private String name;
    private int priority;

    public Group(Module module, String name, int priority) {
        this.module = module;
        this.name = name;
        this.priority = priority;
    }

    public Group(Long id, Module module, String name, int priority) {
        this.id = id;
        this.module = module;
        this.name = name;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(group.name, name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
