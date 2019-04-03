
package ru.mtuci.labwork1.model;

import javax.persistence.*;

@Entity
@Table (name = "student")

public class Student extends BaseEntity {

    public String lastname;
    private String firstname;
    private String patronym;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_group",
                nullable = false)
    private Group group;

    public Student() {

    }

    public Student(Long id, String lastname, String firstname, String patronym, Group group) {
        super(id);
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronym = patronym;
        this.group = group;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronym() {
        return patronym;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(lastname, student.lastname) &&
                Objects.equals(firstname, student.firstname) &&
                Objects.equals(patronym, student.patronym);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname, patronym);
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronym='" + patronym + '\'' +
                '}';
    }
}
