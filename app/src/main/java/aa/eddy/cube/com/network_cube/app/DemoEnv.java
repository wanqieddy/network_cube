package aa.eddy.cube.com.network_cube.app;

/**
 * Created by wanqi on 15-4-16.
 */
public class DemoEnv {

    private static boolean sIsProd = true;

    public static boolean isProd() {
        return sIsProd;
    }

    public static void setIsProd(boolean isProd) {
        sIsProd = isProd;
    }
}