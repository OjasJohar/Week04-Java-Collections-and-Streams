package reflection.advance_level.custom_logging_proxy_using_reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


// Step 3: Create a Dynamic Proxy Handler
public class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Logging the method name
        System.out.println("Executing method: " + method.getName());

        // Invoking the actual method
        return method.invoke(target, args);
    }
}