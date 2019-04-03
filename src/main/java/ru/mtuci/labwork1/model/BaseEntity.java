package ru.mtuci.labwork1.model;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {

    @Id
    @SequenceGenerator(name = "global_seq",
            sequenceName = "global_seq",
            allocationSize = 1, initialValue = 100000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "global_seq")
    @Access(AccessType.FIELD)
    private Long id;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format ("Entity of type %s with id %s",
        getClass().getName(),
        getId()
        );

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

