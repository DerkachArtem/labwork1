package ru.mtuci.labwork1.repository;

import ru.mtuci.labwork1.model.Group;

public class GroupsRepository extends AbstractRepository<Group> {
    GroupsRepository() {
        super(Group.class);
    }
}
