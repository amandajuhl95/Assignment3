package dk.amandaogamalie.Assignment3.generated.valuedomains;

import dk.amandaogamalie.Assignment3.generated.Assignment3;
import dk.amandaogamalie.Assignment3.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.amandaogamalie.Assignment3.generated.valuedomains.impl.WetSuitSizeImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: WetSuitSize
 */
public abstract class WetSuitSize implements Comparable<WetSuitSize>
{
    protected static final IMetaValueDomain edma_domain = Assignment3.environment.getValueDomainDefinitions().getValueDomain(22);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The WetSuitSize from the terminal
     */
    public static WetSuitSize fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new WetSuitSizeImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The WetSuitSize from the string representation
     */
    public static WetSuitSize fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new WetSuitSizeImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The WetSuitSize read from the stream
     */
    public static WetSuitSize fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new WetSuitSizeImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The WetSuitSize read from the stream
     */
    public static WetSuitSize fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new WetSuitSizeImpl(res);
    }

    /**
     * Call this method to create a new WetSuitSize value. 
     * @param value  The value of the WetSuitSize to be created.
     * @return       The newly created WetSuitSize value
     */
    public static WetSuitSize create(String value) throws InvalidValueException
    {
        WetSuitSizeImpl.edma_validate(value);
        return new WetSuitSizeImpl(WetSuitSizeImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided String is a valid WetSuitSize
     * @param value  The String value to be tested
     * @return       true if the provided String is a valid WetSuitSize
     */
    public static boolean isValidWetSuitSize(String value)
    {
        try
        {
            WetSuitSizeImpl.edma_validate(value);
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
     * returns the String value that is stored in this WetSuitSize
     * @return  The String value stored in this WetSuitSize
     */
    public abstract String value();
}
