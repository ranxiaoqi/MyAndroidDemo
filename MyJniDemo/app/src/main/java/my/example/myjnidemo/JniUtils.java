package my.example.myjnidemo;

/**
 * 参考:http://blog.csdn.net/yanbober/article/details/45309049
 *      http://blog.csdn.net/sodino/article/details/41946607
 * Created by admin on 2015/12/25.
 */
public class JniUtils {
    public native String getTestString();
    static {
        System.loadLibrary("MyJni");   //defaultConfig.ndk.moduleName
    }
}
