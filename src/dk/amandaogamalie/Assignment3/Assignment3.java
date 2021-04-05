package dk.amandaogamalie.Assignment3;

import dk.amandaogamalie.Assignment3.generated.valuedomains.Course;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Courses;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Student;

public class Assignment3 {

    public static void main(String[] args) {


        Student student = Student.create().name("John").age(34)
                .courses(Courses.begin()
                        .add(Course.create().id(1234).name("Seahorse riding").points(15))
                        .add(Course.create().id(4321).name("Squid painting").points(5))
                        .end())
                .active("True");

        System.out.println(student);

    }
}
