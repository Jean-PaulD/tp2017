import impl.CarInterfaceImpl;
import org.junit.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-03-26.
 */
public class TestCarSet {
    @Test
    public void setQuestion(){

        CarInterfaceImpl car = new CarInterfaceImpl();


        Set carSet = new HashSet();

        CarInterfaceImpl car1 = new CarInterfaceImpl();
        CarInterfaceImpl car2 = new CarInterfaceImpl();
        CarInterfaceImpl car3 = new CarInterfaceImpl();

        carSet.add("Audi");
        carSet.add("BMW");
        carSet.add("AMG");

        assertEquals("Hash set does not contain that car", true, carSet.contains("AMG"));


        //assertEquals("Second car is not Audi RS4", "Audi RS4", carList.get(1).returnCarBrandandAndModel());
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
        //System.out.println("Time out exception");

    }

}
