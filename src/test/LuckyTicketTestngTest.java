import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Julik on 17.05.2015.
 */
public class LuckyTicketTestngTest {
    // TestNG tests

    @Test
    public void testIsLuckyShouldPassed() throws Exception {
        assertTrue(LuckyTicket.isLucky("123123"),"Test Should PASSED");
    }

    @Test
    public void testIsLuckyShouldFailed() throws Exception {
        Assert.assertFalse(LuckyTicket.isLucky("123120"), "Expected Failed");
    }

}
