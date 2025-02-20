package annotations.practiceproblems.advancelevel.customcacheingsystem;
import java.lang.annotation.*;
import java.util.HashMap;
import java.util.Map;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}

public class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    public static boolean containsKey(String key) {
        return cache.containsKey(key);
    }

    public static Object get(String key) {
        return cache.get(key);
    }

    public static void put(String key, Object value) {
        cache.put(key, value);
    }
}
