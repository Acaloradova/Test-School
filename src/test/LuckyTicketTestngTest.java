import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
* Created by Julik on 17.05.2015.
*/
public class LuckyTicketTestngTest {
    @Test
    public void testIsLuckyShouldPassed() throws Exception {
        assertTrue(LuckyTicket.isLucky("123123"),"Test Should PASSED");
    }

    @Test
    public void testIsLuckyShouldFailed() throws Exception {
        Assert.assertFalse(LuckyTicket.isLucky("123120"), "Expected Failed");
    }

    @Test
    public void testIsValidNumber_notNumber() throws Exception {
        Assert.assertFalse(LuckyTicket.isValidNumber("ticket"), "Symbols instead of numbers should failed");
    }

    @Test
    public void testIsValidNumber_spaceShouldFailed() throws Exception {
        Assert.assertFalse(LuckyTicket.isValidNumber(" "), "Space instead of numbers should failed");
    }

    @Test
    public void testIsValidNumber_moreThan6Symbols() throws Exception {
        Assert.assertFalse(LuckyTicket.isValidNumber("1231233"), "7 symbols should failed");
    }
}
