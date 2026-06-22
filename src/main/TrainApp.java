import java.util.ArrayList;
import java.util.List;

public class TrainApp{
    public static void main(String[] args){
        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        //Order Bogie Ids
        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        trainConsist.add(2, "Pantry Car");
        System.out.println("\nAfter Adding Pantry Car:");
        System.out.println(trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);
    }
}
