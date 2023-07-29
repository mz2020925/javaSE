package demo34_Junit;

import org.junit.*;

public class j1_MyMathTest {
    @BeforeClass  // 它是用来修饰静态方法的
    public static void beforeClass(){
        System.out.println("beforeClass");
    }
    @Before
    public void before(){
        System.out.println("before");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @Test  // 注解表示测试方法，方法体内部是测试代码，其实就是使用src中写的代码看看结果
    public void testAdd() {
        j1_MyMath myMath = new j1_MyMath();
        int addRes = myMath.add(10, 20);
        System.out.println(addRes);
    }

    @Test
    public void testSub() {
        j1_MyMath myMath = new j1_MyMath();
        int subRes = myMath.sub(10, 20);
        System.out.println(subRes);
    }

    @Test
    public void testMul() {
        j1_MyMath myMath = new j1_MyMath();
        int mulRes = myMath.mul(10, 20);
        Assert.assertEquals(198, mulRes,2);
        System.out.println(mulRes);
    }

    @Test
    public void testDiv() {
        j1_MyMath myMath = new j1_MyMath();
        int divRes = myMath.div(10, 20);
        Assert.assertEquals(5, divRes);
        System.out.println(divRes);
    }

}
