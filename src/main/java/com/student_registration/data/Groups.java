package com.student_registration.data;

import java.util.ArrayList;
import java.util.List;

public class Groups {

    private List<Group> groups;

    public Groups() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<Group> findGroupByName(String name) {
        List<Group> foundGroups = new ArrayList<>();
        for (Group group : groups) {
            if (group.getName().equals(name)) {
                foundGroups.add(group);
            }
        }
        return foundGroups;
    }
}
