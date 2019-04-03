import ru.mtuci.labwork1.model.Group;
import ru.mtuci.labwork1.model.Student;
import ru.mtuci.labwork1.repository.GroupsRepository;

public class Main {
    public static void main(String[] args) {
        Student stud1 =
                new Student(1L,"Ивaнов","Андрей","Петрович");
        Group group = new Group(1L, "2MIB1801");

        GroupsRepository groupsRepository = new GroupsRepository();
        groupsRepository.save(group1)
        System.out.println (stud1.toString());
    }
}

