package reflection.advance_level.dependency_injection_using_reflection;

//3. Define Example Classes
public class ServiceB {
    @Inject
    private ServiceA serviceA;

    public void execute() {
        serviceA.doSomething();
        System.out.println("ServiceB executed!");
    }
}
