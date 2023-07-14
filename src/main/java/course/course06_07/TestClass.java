package course.course06_07;

import org.junit.*;

public class TestClass {
    @Test
    public void myTestMethod(){
        System.out.println("Hello world");
    }
    @Test
    @Ignore
    public void myTestMethod2(){
        System.out.println("Hello world again");
    }

    @Before
    public void beforeMethod(){
        System.out.println("Hello world before");
    }
    @After
    public void afterMethod(){
        System.out.println("Hello world after");
    }

    @BeforeClass
    static public void beforeClassMethod(){
        System.out.println("Hello world before class only once");
    }
    @AfterClass
    static public void afterClassMethod(){
        System.out.println("Hello world after class only once");
    }

}
