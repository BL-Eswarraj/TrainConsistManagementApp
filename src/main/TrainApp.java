import java.util.ArrayList;
import java.util.List;

public class TrainApp{
    public static void main(String[] args){
        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();
        // Add Bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("\nUnique Bogie IDs:");

        for (String bogieId : bogieIds) {
            System.out.println(bogieId);
        }
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}
