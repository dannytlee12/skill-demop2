import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test 
    public void isOdd(){
        assertTrue(SkillDemo.isOdd(1));
    }
}
