package reflection.advance_level.custom_logging_proxy_using_reflection;

// Step 2: Implement the Interface
public class GreetingImpl implements Greeting {
    @Override
    public String sayHello(String name) {
        System.out.println("Hello, " + name + "!");
        return name;
    }
}