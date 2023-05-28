import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class SILab2Test {
    @Test
    public void branchTest(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing"));
        assertEquals(false, SILab2.function(new User("user", "abcd efgh", "user@mail.com"), new ArrayList<>()));
        assertEquals(false,SILab2.function(new User("user", "pass", "user@mail.com"), new ArrayList<>()));
        assertEquals(true, SILab2.function(new User("user", "abcdefghi*", "user@mail.com"), new ArrayList<>()));
    }
    @Test
    public void multipleConditionTest(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, ()->SILab2.function(null, new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing"));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("abcd", null, "example@mail.com"),
                new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing"));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("abcd", "examplepassword", null),
                new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing"));
        assertEquals(false, SILab2.function(new User("user", "user@mail.com", "pass"), new ArrayList<>()));
    }
}
