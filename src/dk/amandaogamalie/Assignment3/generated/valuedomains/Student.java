package dk.amandaogamalie.Assignment3.generated.valuedomains;

import dk.amandaogamalie.Assignment3.generated.Assignment3;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Active;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Age;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Courses;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Name;
import dk.amandaogamalie.Assignment3.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.StudentBuilderImpl;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.StudentImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Student
 */
public abstract class Student implements Comparable<Student>
{
    protected static final IMetaValueDomain edma_domain = Assignment3.environment.getValueDomainDefinitions().getValueDomain(7);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Student from the terminal
     */
    public static Student fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new StudentImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Student from the string representation
     */
    public static Student fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new StudentImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Student read from the stream
     */
    public static Student fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new StudentImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Student read from the stream
     */
    public static Student fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new StudentImpl(res);
    }

    /**
     * Starts creation of a new Student
     * @return  Builder interface to set the name field
     */
    public static StudentBuilderName create()
    {
        return new StudentBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field name
     * @return  The value of the field name
     */
    public abstract Name name();

    /**
     * returns the value of the field age
     * @return  The value of the field age
     */
    public abstract Age age();

    /**
     * returns the value of the field courses
     * @return  The value of the field courses
     */
    public abstract Courses courses();

    /**
     * returns the value of the field active
     * @return  The value of the field active
     */
    public abstract Active active();


    /**
     * Builder interface for setting the name field of Student
     */
    public interface StudentBuilderName
    {

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the age field
         */
        public StudentBuilderAge name(Name name);

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the age field
         */
        public StudentBuilderAge name(String name) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the age field of Student
     */
    public interface StudentBuilderAge
    {

        /**
         * sets the age field.
         * @param age  The value to assign to the age field
         * @return     Builder interface for setting the courses field
         */
        public StudentBuilderCourses age(Age age);

        /**
         * sets the age field.
         * @param age  The value to assign to the age field
         * @return     Builder interface for setting the courses field
         */
        public StudentBuilderCourses age(Integer age) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the courses field of Student
     */
    public interface StudentBuilderCourses
    {

        /**
         * sets the courses field.
         * @param courses  The value to assign to the courses field
         * @return         Builder interface for setting the active field
         */
        public StudentBuilderActive courses(Courses courses);

    }



    /**
     * Builder interface for setting the active field of Student
     */
    public interface StudentBuilderActive
    {

        /**
         * sets the active field.
         * @param active  The value to assign to the active field
         * @return        The created Student value
         */
        public Student active(Active active);

        /**
         * sets the active field.
         * @param active  The value to assign to the active field
         * @return        The created Student value
         */
        public Student active(String active) throws InvalidValueException;

    }

}
