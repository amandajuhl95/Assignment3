package dk.amandaogamalie.Assignment3.generated.valuedomains;

import dk.amandaogamalie.Assignment3.generated.Assignment3;
import dk.amandaogamalie.Assignment3.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.MillisecondImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Millisecond
 */
public abstract class Millisecond implements Comparable<Millisecond>
{
    protected static final IMetaValueDomain edma_domain = Assignment3.environment.getValueDomainDefinitions().getValueDomain(8);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Millisecond from the terminal
     */
    public static Millisecond fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new MillisecondImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Millisecond from the string representation
     */
    public static Millisecond fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new MillisecondImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Millisecond read from the stream
     */
    public static Millisecond fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new MillisecondImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Millisecond read from the stream
     */
    public static Millisecond fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new MillisecondImpl(res);
    }

    /**
     * Call this method to create a new Millisecond value. 
     * @param value  The value of the Millisecond to be created.
     * @return       The newly created Millisecond value
     */
    public static Millisecond create(Integer value) throws InvalidValueException
    {
        MillisecondImpl.edma_validate(value);
        return new MillisecondImpl(MillisecondImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Integer is a valid Millisecond
     * @param value  The Integer value to be tested
     * @return       true if the provided Integer is a valid Millisecond
     */
    public static boolean isValidMillisecond(Integer value)
    {
        try
        {
            MillisecondImpl.edma_validate(value);
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
     * returns the Integer value that is stored in this Millisecond
     * @return  The Integer value stored in this Millisecond
     */
    public abstract Integer value();
}