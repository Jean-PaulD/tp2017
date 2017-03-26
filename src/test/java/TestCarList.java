import impl.CarInterfaceImpl;
import org.junit.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-03-26.
 */
public class TestCarList {

    @Test
    public void listQuestion(){

        CarInterfaceImpl car = new CarInterfaceImpl();
        List<CarInterfaceImpl> carList = new ArrayList();

        CarInterfaceImpl car1 = new CarInterfaceImpl();
        CarInterfaceImpl car2 = new CarInterfaceImpl();
        CarInterfaceImpl car3 = new CarInterfaceImpl();

            car1.setCarBrandAndModel("BMW", "M4");
            carList.add(0, car1);
            car2.setCarBrandAndModel("Audi", "RS4");
            carList.add(1, car2);
            car3.setCarBrandAndModel("Mercedes-AMG", "C63");
            carList.add(2, car3);

        assertEquals("Second car is not Audi RS4", "Audi RS4", carList.get(1).returnCarBrandandAndModel());

        //remove items
        carList.remove(1);
        assertEquals("Expected result is the Mercedes", "Mercedes-AMG C63", carList.get(1).returnCarBrandandAndModel());
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
