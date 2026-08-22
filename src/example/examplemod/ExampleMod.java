package example.examplemod;

import copper.core.mod.*;

public class ExampleMod extends CopperMod {
    public ExampleMod() {
        // refer to https://github.com/Anuken/MindustryJavaModTemplate/blob/master/src/example/ExampleJavaMod.java
    }

    // something different from Mindustry mod
    @Override
    public void registerPackets() {
        // register some network packet here if needed.
        // e.g. :
        // CopperNet.registerPacket(MyPacket::new);
    }
}
