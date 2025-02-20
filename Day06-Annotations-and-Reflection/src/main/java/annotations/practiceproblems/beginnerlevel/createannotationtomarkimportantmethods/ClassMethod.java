package annotations.practiceproblems.beginnerlevel.createannotationtomarkimportantmethods;

public class ClassMethod {

    @ImportantMethod(importance = "High")
    public void processOne() {
        System.out.println("Method is Important");
    }
    @ImportantMethod(importance = "Low")
    public void processTwo() {
        System.out.println("Method is not very Important");
    }
}
