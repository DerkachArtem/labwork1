package ru.mtuci.labwork1.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "group")
public class Group extends  BaseEntity {
    private long id;
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @OneToMany(fetch = FetchType.LAZY,
                  mappedBy = "group")

    private Set<Student> students;
    public Group() {
    }

    public Group(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
