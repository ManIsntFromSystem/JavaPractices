package JavaEightEx;

import android.net.wifi.p2p.WifiP2pManager;

public class LambdaLessonOneEx {
    public static void main(String[] args) {
     /*   (x, x, d) -> {
            System.out.println("ssss");
        };*/
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Run1 ");
            }
        };
    Runnable runnable1 = () -> System.out.println("Run2");
    }
}
