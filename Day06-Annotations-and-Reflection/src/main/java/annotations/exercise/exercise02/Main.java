package annotations.exercise.exercise02;
import java.util.*;
public class Main extends LegacyAPI {
    public static void main(String[] args) {
        LegacyAPI legacyAPI = new LegacyAPI();

        //calling deprecated marked method
        legacyAPI.oldFeature();
        //calling new method
        legacyAPI.newFeature();
    }
}
