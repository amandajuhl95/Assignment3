package dk.amandaogamalie.Assignment3.generated.valuedomains.impl;

import dk.amandaogamalie.Assignment3.generated.valuedomains.Active;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Age;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Courses;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Name;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Student;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Student.StudentBuilderActive;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Student.StudentBuilderAge;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Student.StudentBuilderCourses;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Student.StudentBuilderName;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.ActiveImpl;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.AgeImpl;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.NameImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class StudentBuilderImpl implements StudentBuilderActive, StudentBuilderAge, StudentBuilderCourses, StudentBuilderName
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public StudentBuilderImpl()
    {
        edma_value = new Object[4];
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the age field
     */
    public StudentBuilderAge name(Name name)
    {
        if(name == null) throw new NullPointerException("The field name in Student may not be null");
        edma_value[0] = ((IValueInstance) name).edma_getValue();
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the age field
     */
    public StudentBuilderAge name(String name) throws InvalidValueException
    {
        if(name != null) NameImpl.edma_validate(name);
        if(name == null) throw new NullPointerException();
        edma_value[0] = NameImpl.edma_create(name);
        return this;
    }

    /**
     * sets the age field.
     * @param age  The value to assign to the age field
     * @return     Builder interface for setting the courses field
     */
    public StudentBuilderCourses age(Age age)
    {
        if(age == null) throw new NullPointerException("The field age in Student may not be null");
        edma_value[1] = ((IValueInstance) age).edma_getValue();
        return this;
    }

    /**
     * sets the age field.
     * @param age  The value to assign to the age field
     * @return     Builder interface for setting the courses field
     */
    public StudentBuilderCourses age(Integer age) throws InvalidValueException
    {
        if(age != null) AgeImpl.edma_validate(age);
        if(age == null) throw new NullPointerException();
        edma_value[1] = AgeImpl.edma_create(age);
        return this;
    }

    /**
     * sets the courses field.
     * @param courses  The value to assign to the courses field
     * @return         Builder interface for setting the active field
     */
    public StudentBuilderActive courses(Courses courses)
    {
        if(courses == null) throw new NullPointerException("The field courses in Student may not be null");
        edma_value[2] = ((IValueInstance) courses).edma_getValue();
        return this;
    }

    /**
     * sets the active field.
     * @param active  The value to assign to the active field
     * @return        The created Student value
     */
    public Student active(Active active)
    {
        if(active == null) throw new NullPointerException("The field active in Student may not be null");
        edma_value[3] = ((IValueInstance) active).edma_getValue();
        return new StudentImpl(StudentImpl.edma_create(edma_value));
    }

    /**
     * sets the active field.
     * @param active  The value to assign to the active field
     * @return        The created Student value
     */
    public Student active(String active) throws InvalidValueException
    {
        if(active != null) ActiveImpl.edma_validate(active);
        if(active == null) throw new NullPointerException();
        edma_value[3] = ActiveImpl.edma_create(active);
        return new StudentImpl(StudentImpl.edma_create(edma_value));
    }
}
