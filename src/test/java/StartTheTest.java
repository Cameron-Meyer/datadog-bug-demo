import com.intuit.karate.core.Feature;
import com.intuit.karate.junit5.Karate;
import com.intuit.karate.resource.Resource;
import com.intuit.karate.resource.ResourceUtils;

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