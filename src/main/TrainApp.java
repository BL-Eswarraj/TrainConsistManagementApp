import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp{
    public static void main(String[] args){
        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Preserve original order using Linked Hashset
        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println("\nTrain Formation:");
        for (String bogie : formation) {
            System.out.println(bogie);
        }
        System.out.println("\nFinal Formation:");
        System.out.println(formation);
    }
}
