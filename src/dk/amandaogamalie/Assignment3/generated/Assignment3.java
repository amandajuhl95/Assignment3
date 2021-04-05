package dk.amandaogamalie.Assignment3.generated;

import java.util.ArrayList;
import java.util.Collection;
import org.abstractica.edma.metamodel.IMetaEnvironment;
import org.abstractica.edma.metamodel.impl.MetaEnvironment;
import org.abstractica.edma.metamodel.impl.ValueDomainBuilder;
import org.abstractica.edma.metamodel.impl.ValueDomainBuilder.Field;
import org.abstractica.edma.runtime.implementations.mem.modelstore.speed.newindex.IndexUtil;
import org.abstractica.edma.runtime.intf.IRuntimeFactory;
import org.abstractica.edma.valuedomains.impl.Constraint;

/**
 * 
 */
public class Assignment3
{
    public static final IMetaEnvironment environment = generateEnvironment();



    /**
     * generate the environment
     * @return  
     */
    public static IMetaEnvironment generateEnvironment()
    {
        ValueDomainBuilder vdb = new ValueDomainBuilder();
        
        //Integer value domain: Id
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("Id", null, null, null, edma_constraints, false);
        }
        
        //String value domain: Name
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Name", null, 1, 20, null, edma_constraints, false);
        }
        
        //Integer value domain: Age
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("Age", null, 0, 100, edma_constraints, false);
        }
        
        //Integer value domain: ECTSPoints
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("ECTSPoints", null, 1, 60, edma_constraints, false);
        }
        
        //Enum value domain: Active
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<String> elements = new ArrayList<String>();
            elements.add("True");
            elements.add("False");
            vdb.newEnumDomain("Active", null, elements, edma_constraints, false);
        }
        
        //Struct value domain: Course
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("id", "Id", false));
            fields.add(vdb.newStructField("name", "Name", false));
            fields.add(vdb.newStructField("points", "ECTSPoints", false));
            vdb.newStructDomain("Course", null, fields, edma_constraints, false);
        }
        
        //List value domain: Courses
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newListDomain("Courses", null, "Course", null, null, edma_constraints, false);
        }
        
        //Struct value domain: Student
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("name", "Name", false));
            fields.add(vdb.newStructField("age", "Age", false));
            fields.add(vdb.newStructField("courses", "Courses", false));
            fields.add(vdb.newStructField("active", "Active", false));
            vdb.newStructDomain("Student", null, fields, edma_constraints, false);
        }
        MetaEnvironment edma_environment = new MetaEnvironment("Assignment3");
        vdb.buildWithEnvironment(edma_environment);
        //Hack to make serializeable work...
        IndexUtil.setValueDomainDefinitions(edma_environment.getValueDomainDefinitions());
        return edma_environment;
    }

    /**
     * Constructor
     * @param factory  The runtime factory
     */
    public Assignment3(IRuntimeFactory factory)
    {
        
    }
}
