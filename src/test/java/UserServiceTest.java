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
        User user1 = new User(1, "John", "Smith", 30,  "john@mail.ru");
        User user2 = new User(2, "Steve", "Manson", 23,  "steve_manson@mail.ru");
        User user3 = new User(3, "Mark", "Dakaskos", 45,  "mark_tiger@mail.ru");
        User user4 = new User(4, "Leonardo", "DiCaprio", 38,  "titanik@mail.ru");
        User user5 = new User(5, "Natasha", "Volkova", 27,  "widow@mail.ru");
        User user6 = new User(6, "Duwene", "Jonson", 41,  "the_rock@mail.ru");
        User user7 = new User(7, "Paul", "Walker", 36,  "forsage@mail.ru");
    }
}
