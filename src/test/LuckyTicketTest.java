import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LuckyTicketTest {

    @Test
    public void testIsLucky_positive() throws Exception {
        assertTrue("123123 - lucky ticket, positive test", LuckyTicket.isLucky("123123"));
    }

    @Test
    public void testIsLucky_failed() throws Exception {
        assertFalse("124123 - negative test", LuckyTicket.isLucky("124120"));
    }

    @Test
    public void isValidNumber_empty() throws Exception {
        assertFalse("empty test should failed", LuckyTicket.isValidNumber(""));
    }

    @Test
    public void testIsLucky_words() throws Exception {
        assertFalse("not a number", LuckyTicket.isValidNumber("ticket"));
    }

    @Test
    public void testIsLucky_4symbols() throws Exception {
        assertFalse("less than 6 symbols", LuckyTicket.isValidNumber("1221"));
    }
}
