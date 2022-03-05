package com.tomash.androidcontacts.contactgetter.entity;

public class Organization {
    private String name = "";
    private String title = "";
    private String department;

    public String getName() {
        return name;
    }

    public Organization setName(String name) {
        if (name == null) return this;
        this.name = name;
        return this;
    }

    public Organization(String name, String title) {
        setName(name);
        setTitle(title);
    }

    public Organization(String name, String title, String department) {
        setName(name);
        setTitle(title);
        setDepartment(department);
    }

    public Organization() {
    }

    public String getDepartment() {
        return department;
    }

    public Organization setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Organization setTitle(String title) {
        if (title == null) return this;
        this.title = title;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organization that = (Organization) o;

        if (!name.equals(that.name)) return false;
        return title.equals(that.title);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + title.hashCode();
        return result;
    }
}
