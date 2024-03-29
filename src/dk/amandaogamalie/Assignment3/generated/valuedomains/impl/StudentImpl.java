package dk.amandaogamalie.Assignment3.generated.valuedomains.impl;

import dk.amandaogamalie.Assignment3.generated.valuedomains.Active;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Age;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Courses;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Name;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Student;
import dk.amandaogamalie.Assignment3.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.ActiveImpl;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.AgeImpl;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.CoursesImpl;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.NameImpl;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * The implementation of Student
 */
public class StudentImpl extends Student implements IValueInstance
{
    private int edma_hash;
    private Object[] value;



    /**
     * Check if a value is valid
     * @param value  The value to validate
     */
    public static void edma_validate(Object value) throws InvalidValueException
    {
        edma_domain.validate(value, EDMA_ExternalConstraints.instance);
    }

    /**
     * create value without checking
     * @param value  The value to check and create
     * @return       <tt>true</tt> The new created value
     */
    public static Object edma_create(Object value)
    {
        return edma_domain.newValue(value);
    }

    /**
     * Constructor
     * @param o  The Object that represents this struct value
     */
    public StudentImpl(Object o)
    {
        edma_hash = 0;
        value = (Object[]) o;
    }

    /**
     * Gets the value domain for this value instance
     * @return  The value domain for this value instance
     */
    public IMetaValueDomain edma_getDomain()
    {
        return edma_domain;
    }

    /**
     * Access to the general Object value
     * @return  The value as a general Object
     */
    public Object edma_getValue()
    {
        return value;
    }

    /**
     * Returns <tt>true</tt> if this value equals the given value
     * @param o  Object to test equality with
     * @return   <tt>true</tt> if this value equals the given value
     */
    public boolean equals(Object o)
    {
        if(!(o instanceof IValueInstance)) return false;
        IValueInstance inst = (IValueInstance) o;
        if(7 != inst.edma_getDomain().getIndex()) return false;
        return edma_domain.valueEqual(value, inst.edma_getValue());
    }

    /**
     * Gets the value hash for this value instance
     * @return  The hash for this value instance
     */
    public int hashCode()
    {
        if(edma_hash == 0) edma_hash = edma_domain.valueHashCode(value);
        return edma_hash;
    }

    /**
     * Returns this value instance as a string
     * @return  this value instance as a string
     */
    public String toString()
    {
        return edma_domain.valueToString(value);
    }

    /**
     * Compare this Student to another Student
     * @param student  The Student to compare with
     * @return         A negative integer, zero, or a positive integer as this
     *                 Student is less than, equal to, or greater than the
     *                 specified Student
     */
    public int compareTo(Student student)
    {
        return edma_domain.valueCompare(value, ((StudentImpl) student).value);
    }

    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public void toStream(DataOutput out) throws IOException
    {
        edma_domain.writeValue(((IValueInstance) this).edma_getValue(), out);
    }

    /**
     * returns the value of the field name
     * @return  The value of the field name
     */
    public Name name()
    {
        return new NameImpl(value[0]);
    }

    /**
     * returns the value of the field age
     * @return  The value of the field age
     */
    public Age age()
    {
        return new AgeImpl(value[1]);
    }

    /**
     * returns the value of the field courses
     * @return  The value of the field courses
     */
    public Courses courses()
    {
        return new CoursesImpl(value[2]);
    }

    /**
     * returns the value of the field active
     * @return  The value of the field active
     */
    public Active active()
    {
        return new ActiveImpl(value[3]);
    }
}
