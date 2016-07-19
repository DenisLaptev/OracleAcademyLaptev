package MyWebProject;

/**
 * Created by lapte on 14.07.2016.
 */
public class MySingleton {
    private static MySingleton ourInstance = new MySingleton();

    public static MySingleton getInstance() {
        return ourInstance;
    }

    private MySingleton() {
    }
}
