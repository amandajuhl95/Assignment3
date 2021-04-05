package dk.amandaogamalie.Assignment3.generated.valuedomains.impl;

import dk.amandaogamalie.Assignment3.generated.valuedomains.Course;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Course.CourseBuilderId;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Course.CourseBuilderName;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Course.CourseBuilderPoints;
import dk.amandaogamalie.Assignment3.generated.valuedomains.ECTSPoints;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Id;
import dk.amandaogamalie.Assignment3.generated.valuedomains.Name;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.ECTSPointsImpl;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.IdImpl;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.NameImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class CourseBuilderImpl implements CourseBuilderId, CourseBuilderName, CourseBuilderPoints
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public CourseBuilderImpl()
    {
        edma_value = new Object[3];
    }

    /**
     * sets the id field.
     * @param id  The value to assign to the id field
     * @return    Builder interface for setting the name field
     */
    public CourseBuilderName id(Id id)
    {
        if(id == null) throw new NullPointerException("The field id in Course may not be null");
        edma_value[0] = ((IValueInstance) id).edma_getValue();
        return this;
    }

    /**
     * sets the id field.
     * @param id  The value to assign to the id field
     * @return    Builder interface for setting the name field
     */
    public CourseBuilderName id(Integer id)
    {
        if(id == null) throw new NullPointerException();
        edma_value[0] = IdImpl.edma_create(id);
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the points field
     */
    public CourseBuilderPoints name(Name name)
    {
        if(name == null) throw new NullPointerException("The field name in Course may not be null");
        edma_value[1] = ((IValueInstance) name).edma_getValue();
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the points field
     */
    public CourseBuilderPoints name(String name) throws InvalidValueException
    {
        if(name != null) NameImpl.edma_validate(name);
        if(name == null) throw new NullPointerException();
        edma_value[1] = NameImpl.edma_create(name);
        return this;
    }

    /**
     * sets the points field.
     * @param points  The value to assign to the points field
     * @return        The created Course value
     */
    public Course points(ECTSPoints points)
    {
        if(points == null) throw new NullPointerException("The field points in Course may not be null");
        edma_value[2] = ((IValueInstance) points).edma_getValue();
        return new CourseImpl(CourseImpl.edma_create(edma_value));
    }

    /**
     * sets the points field.
     * @param points  The value to assign to the points field
     * @return        The created Course value
     */
    public Course points(Integer points) throws InvalidValueException
    {
        if(points != null) ECTSPointsImpl.edma_validate(points);
        if(points == null) throw new NullPointerException();
        edma_value[2] = ECTSPointsImpl.edma_create(points);
        return new CourseImpl(CourseImpl.edma_create(edma_value));
    }
}
