package Singleton;

public class Singleton {

    private Singleton() {}
    private static volatile Singleton instance;
    public static void getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
    }

}
