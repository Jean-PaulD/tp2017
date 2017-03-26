import domain.User;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Jean-Paul D on 2017-03-19.
 */

public class TestUser {

    @Test
    public void testAddition(){
        int result = 20+10;
        assertEquals("not getting expected reslt", 10, result);
    }

    @Test
    public void testSalary(){


        assertEquals("Salaries are not equal", 13.2f==13.2f, true);

    }

    @Test
    public void testAge(){
        User user1 = new User();
        User user2 = new User();

        user1.setAge(113);
        user2.setAge(113);

        assertEquals("Ages are not equal", user1.getAge() == user2.getAge(), true);
    }

    @Test
    public void testUserEquality(){
        User user1 = new User("Jean-Paul De Buys", 35, 100.50f, false);
        User user2 = new User("Jean-Paul De Buys1", 351, 100.51f, true);
        User user3 = user2;
        User user4 = user2;

        assertSame("Users are not equal", user3 == user4, true);

    }

    @Test
    public void testUserIdentity(){
        User user1 = new User("Jean-Paul De Buys", 35, 100.50f, false);
        User user2 = new User("Jean-Paul De Buys1", 351, 100.51f, true);
        User user3 = user2;
        User user4 = user2;

        assertSame("Users Identity are not equal", user3 == user4, true);
    }

    @Test
    public void testNull(){
        User user1 = new User("Jean-Paul De Buys", 35, 100.50f, false);
        User user2 = new User("Jean-Paul De Buys1", 351, 100.51f, true);
        User user3 = null;
        User user4 = null;

        assertNull("User is not null", user3);
    }

    @Test
    public void testNotNull(){
        User user1 = new User("Jean-Paul De Buys", 35, 100.50f, false);
        User user2 = new User("Jean-Paul De Buys1", 351, 100.51f, true);
        User user3 = user2;
        User user4 = null;

        assertNotNull("User is null", user3);
    }


    @Test
    public void testMarried(){
        User user1 = new User("Jean-Paul De Buys", 35, 100.50f, false);
        User user2 = new User("Jean-Paul De Buys1", 351, 100.51f, true);
        user1.setMarried(true);
        assertTrue("User is not married", user1.isMarried());
    }

    @Test
    public void testNotMarried(){
        User user1 = new User("Jean-Paul De Buys", 35, 100.50f, false);
        User user2 = new User("Jean-Paul De Buys1", 351, 100.51f, true);
        user1.setMarried(false);
        assertFalse("User is  married", user1.isMarried());
    }

    @Test
    public void failingMarriageTest(){
        User user1 = new User("Jean-Paul De Buys", 35, 100.50f, false);
        User user2 = new User("Jean-Paul De Buys1", 351, 100.51f, true);
        user1.setMarried(true);
        assertFalse("Fail test: User is married", user1.isMarried());
    }

    @Test
    public void userArray(){

        int[] num = new int[5];
        num[1] = 11;
        num[2] = 12;
        num[3] = 13;
        num[4] = 14;
//        num[5] = 15;


        assertTrue("Number not found", 12 == 12 );
    }




    @BeforeClass
    public static void beforeClass(){
        System.out.println("In before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("In after class");
    }

    @Before
    public void before(){
        System.out.println("In before");
    }

    @After
    public void after(){
        System.out.println("In after");
    }

    @Ignore
    public void ignoreTest(){
        System.out.println("In ignore test");
    }

 /*  @Test (expected = Exception.class)
    public void testException(){
        System.out.println("This is just testing the exception test method.");

    }
    */

    @Test(timeout=100)
    public void testTimeOut(){


    }

}
