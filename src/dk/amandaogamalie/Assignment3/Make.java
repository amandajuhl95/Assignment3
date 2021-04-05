package dk.amandaogamalie.Assignment3;

import org.abstractica.edma.generator.EdmaGenerator;

public class Make {

    public static void main(String[] args) {
        String projectDir = "/Users/aamandajuhl/Documents/Software/Første semester/Databaser/EDMA/Assignment3";
        EdmaGenerator generator = new EdmaGenerator("Assignment3", projectDir + "/edmasrc", projectDir+ "/src", "dk.amandaogamalie.Assignment3");
        generator.make();
    }
}
