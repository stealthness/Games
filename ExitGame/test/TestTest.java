import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class TestTest {

    @BeforeEach
    public void setUp(){
        // to do
    }

    @Test
    public void testFail(){
        fail("test fail");
    }

    @Test
    public void testTrue(){
        assertTrue(true);
    }
}
