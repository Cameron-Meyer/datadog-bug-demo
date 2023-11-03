package buggy;

import com.intuit.karate.junit5.Karate;

class StartTheTest {
    @Karate.Test
    Karate testSetup() {
        return Karate.run().relativeTo(getClass()).tags("@withSetup");
    }

    @Karate.Test
    Karate testSetupOnce() {
        return Karate.run().relativeTo(getClass()).tags("@withSetupOnce");
    }
}