import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    private static final String FIRST_NAME = "mka";

    @Test
    public void testFirstName(){
        Person p = new Person();
        p.setFirstName(FIRST_NAME);
        Assert.assertEquals(FIRST_NAME, p.getFirstName());

    }
}
