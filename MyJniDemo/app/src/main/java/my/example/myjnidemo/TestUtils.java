package my.example.myjnidemo;

/**
 *
 * Created by admin on 2016/1/4.
 */
public class TestUtils {
    static {
        System.loadLibrary("RSA");
    }
    public native String CreateKey(String key);
    public native String GetAesEncry(String Key,String input,String output);
}
