import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTests {

@Test
public void reverseTestWithNull(){
        Assert.assertNull(ReverseString.reverseString(null));
    }
    @Test
    public void reverseTestWithDigits(){
    Assert.assertEquals("cba321", ReverseString.reverseString("123abc") );
    }
}
