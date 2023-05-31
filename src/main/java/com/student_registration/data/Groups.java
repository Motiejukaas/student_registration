package com.student_registration.data;

import java.util.ArrayList;
import java.util.List;

public class Groups {

    private List<Group> groups;

    private static volatile Groups instance = null;

    private Groups() {
        this.groups = new ArrayList<>();
    }

    //singleton method
    public static Groups getInstance() {
        if (instance == null) {
            synchronized (Groups.class) {
                if (instance == null) {
                    instance = new Groups();
                }
            }
        }
        return instance;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public List<Group> getGroups() {
        return groups;
    }

    public Group findGroupByName(String name) {
        Group found_group = null;
        for (Group group : groups) {
            if (group.getName().equals(name)) {
                found_group = group;
            }
        }
        return found_group;
    }

}
