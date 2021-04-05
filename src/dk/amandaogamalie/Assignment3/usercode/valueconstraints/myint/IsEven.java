package dk.amandaogamalie.Assignment3.usercode.valueconstraints.myint;

import dk.amandaogamalie.Assignment3.generated.valuedomains.MyInt;

/**
 * This class is the implementation class for the MyInt constraint isEven
 * No description given
 */
public class IsEven
{



    /**
     * Checks the isEven constraint for the MyInt value domain.
     * No description given
     * @param myInt  The instance value to be checked
     * @return       the reason the constraint is violated, or <tt>null</tt> if
     *               the constraint is not violated
     */
    public static String checkIsEven(MyInt myInt)
    {
        // Implementation of constraint isEven
        // WARNING : Any code outside the following begin and end tags
        // will be lost when re-generation occurs.
        
        // EDMA_non-generated_code_begin
        
        if(myInt.value() % 2 == 0){
            return null;
        }
        return "This value must be an even number, " + myInt + " is not even." ;

        
        // EDMA_non-generated_code_end
    }


}
