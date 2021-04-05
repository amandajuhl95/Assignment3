package dk.amandaogamalie.Assignment3.generated.valuedomains;

import dk.amandaogamalie.Assignment3.generated.Assignment3;
import dk.amandaogamalie.Assignment3.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.ActiveImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Active
 */
public abstract class Active implements Comparable<Active>
{
    protected static final IMetaValueDomain edma_domain = Assignment3.environment.getValueDomainDefinitions().getValueDomain(4);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Active from the terminal
     */
    public static Active fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new ActiveImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Active from the string representation
     */
    public static Active fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new ActiveImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Active read from the stream
     */
    public static Active fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new ActiveImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Active read from the stream
     */
    public static Active fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new ActiveImpl(res);
    }

    /**
     * Call this method to create a new Active value. 
     * @param value  The value of the Active to be created.
     * @return       The newly created Active value
     */
    public static Active create(String value) throws InvalidValueException
    {
        ActiveImpl.edma_validate(value);
        return new ActiveImpl(ActiveImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided String is a valid Active
     * @param value  The String value to be tested
     * @return       true if the provided String is a valid Active
     */
    public static boolean isValidActive(String value)
    {
        try
        {
            ActiveImpl.edma_validate(value);
        }
        catch(InvalidValueException e)
        {
            return false;
        }
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the String value that is stored in this Active
     * @return  The String value stored in this Active
     */
    public abstract String value();
}
