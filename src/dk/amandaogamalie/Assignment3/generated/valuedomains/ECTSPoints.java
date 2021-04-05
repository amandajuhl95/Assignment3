package dk.amandaogamalie.Assignment3.generated.valuedomains;

import dk.amandaogamalie.Assignment3.generated.Assignment3;
import dk.amandaogamalie.Assignment3.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.ECTSPointsImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: ECTSPoints
 */
public abstract class ECTSPoints implements Comparable<ECTSPoints>
{
    protected static final IMetaValueDomain edma_domain = Assignment3.environment.getValueDomainDefinitions().getValueDomain(3);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The ECTSPoints from the terminal
     */
    public static ECTSPoints fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new ECTSPointsImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The ECTSPoints from the string representation
     */
    public static ECTSPoints fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new ECTSPointsImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The ECTSPoints read from the stream
     */
    public static ECTSPoints fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new ECTSPointsImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The ECTSPoints read from the stream
     */
    public static ECTSPoints fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new ECTSPointsImpl(res);
    }

    /**
     * Call this method to create a new ECTSPoints value. 
     * @param value  The value of the ECTSPoints to be created.
     * @return       The newly created ECTSPoints value
     */
    public static ECTSPoints create(Integer value) throws InvalidValueException
    {
        ECTSPointsImpl.edma_validate(value);
        return new ECTSPointsImpl(ECTSPointsImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Integer is a valid ECTSPoints
     * @param value  The Integer value to be tested
     * @return       true if the provided Integer is a valid ECTSPoints
     */
    public static boolean isValidECTSPoints(Integer value)
    {
        try
        {
            ECTSPointsImpl.edma_validate(value);
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
     * returns the Integer value that is stored in this ECTSPoints
     * @return  The Integer value stored in this ECTSPoints
     */
    public abstract Integer value();
}
