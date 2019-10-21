package de.neemann.digital.test;

import de.neemann.digital.core.memory.DataField;
import de.neemann.digital.core.memory.RAMDualPort;
import de.neemann.digital.core.memory.RAMInterface;
import de.neemann.digital.core.memory.ROM;
import de.neemann.digital.core.memory.importer.Importer;
import de.neemann.digital.testing.UnitTester;

import java.io.File;

public class TestCircuit {

    public static void main(String[] args) throws Exception {
        File circuit = new File(args[0]);

        File hexFile = new File(args[1]);
        File outFile = new File(args[2]);

        DataField program = Importer.read(hexFile, 16);

        // run the program
        RAMInterface ram = new UnitTester(circuit)      // load processor
                .writeDataTo(pm -> pm instanceof ROM && pm.getDataBits() == 16, program)
                                                        // write program to the 16-Bit rom
                .runToBreak()                           // run program to break point
                .getRAM(v -> v instanceof RAMDualPort); // get the data ram of processor

        DataField ramContent = ram.getMemory();

        ramContent.saveTo(outFile);
    }
}
