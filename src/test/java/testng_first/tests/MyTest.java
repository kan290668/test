//package testng_first.tests;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import testng_first.dev.DevC?lass;
//import testng_first.dev.WrongLoginException;
//
//public class MyTest {
//    private String validLogin = "qwertt_123";
//    private String invalidLogin = "qwertt_123!%";
//    private String invalidPassword = "qwertt_123!%";
//    private String validPassword1 = "qwertt_123";
//    private String validPassword2 = "qwertt_123";
//
//
//    @Test
//    public void firstTest() {
//        String actual = DevClass.reverseWord("1234");
//        Assert.assertEquals(actual, "4321", "reverse word is not correct");
//
//    }
//
//    @Test(expectedExceptions = IllegalArgumentException.class)
//    public void secondTest() {
//        String actual = DevClass.reverseWord(null);
//
//    }
//
//    @Test(expectedExceptions = RuntimeException.class)
//    public void oneSignest() {
//        String actual = DevClass.reverseWord("1");
//
//    }
//    @Test(expectedExceptions = IllegalArgumentException.class)
//    public void checkSpace() {
//        String actual = DevClass.reverseWord(" ");
//    }
//    public void firstTest () throws WrongLoginException, WrongLoginException {
//        boolean actual  = DevClass. logIn(validLogin, validPassword1, validPassword1);
//        Assert.assertTrue(actual, "actual is not true");
//    }
//
//}
