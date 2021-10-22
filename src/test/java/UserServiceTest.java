import model.User;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import service.UserService;

public class UserServiceTest {
    private UserService userService;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void globalSetUp() {
        System.out.println("Initial setup...");
        System.out.println("Code executes only at once.");
    }

    @Before
    public void setUp() {
        System.out.println("Code executes before each method");
        User user1 = new User(1, "John", "Smith");
    }
}
