import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

public class LuckyTicketTest {

//  jUnit tests
    @Test
    public void testIsLucky_positive() throws Exception {
    assertTrue("123123 - lucky ticket, positive test",LuckyTicket.isLucky("123123"));
}
    @Test
    public void testIsLucky_failed() throws Exception {
        assertFalse("124123 - negative test",LuckyTicket.isLucky("124120"));
    }

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
