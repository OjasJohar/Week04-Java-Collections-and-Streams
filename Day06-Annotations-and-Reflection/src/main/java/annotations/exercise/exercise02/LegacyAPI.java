package annotations.exercise.exercise02;
import java.util.*;
import java.lang.System.*;

public class LegacyAPI {

    @Deprecated
    public void oldFeature(){
        System.out.println("Old Method");
    }

    public void newFeature(){
        System.out.println("New Method");
    }

}
