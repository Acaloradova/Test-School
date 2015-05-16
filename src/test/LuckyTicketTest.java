import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

}
