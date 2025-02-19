package reflection.advance_level.dependency_injection_using_reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

//2. Implement the DI Container
public class DIContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();

    public void register(Class<?> clazz) throws Exception {
        Object instance = createInstance(clazz);
        instances.put(clazz, instance);
    }

    private Object createInstance(Class<?> clazz) throws Exception {
        Object instance = clazz.getDeclaredConstructor().newInstance();
        injectDependencies(instance);
        return instance;
    }

    private void injectDependencies(Object instance) throws Exception {
        Field[] fields = instance.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = instances.computeIfAbsent(fieldType, this::safeCreate);
                field.setAccessible(true);
                field.set(instance, dependency);
            }
        }
    }

    private Object safeCreate(Class<?> clazz) {
        try {
            return createInstance(clazz);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance for: " + clazz.getName(), e);
        }
    }

    public <T> T getInstance(Class<T> clazz) {
        return clazz.cast(instances.get(clazz));
    }
}
