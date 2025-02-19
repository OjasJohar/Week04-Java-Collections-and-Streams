package reflection.advance_level.dependency_injection_using_reflection;

//4. Use the DI Container
public class Main {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();
        container.register(ServiceA.class);
        container.register(ServiceB.class);

        ServiceB serviceB = container.getInstance(ServiceB.class);
        serviceB.execute();
    }
}

