/***********************************************************
 * Name: Lacey Roof
 * Assignment: FieldLedger - Resource Manager 
 *
 * Main Application
 */
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nFieldLedger Resource Manager - Week 3\n");

    // Create ResourceManager object
        ResourceManager manager = new ResourceManager();

    // Create sample resources
        Equipment equipment1 = new Equipment(1, "Excavator", "Hour", 145.00, true);
        Labor labor1 = new Labor(2, "Operator", "Hour", 38.00, true);
        Material material1 = new Material(3, "Gravel", "Ton", 24.00, true);

    // Add resources
        manager.addResource(equipment1);
        manager.addResource(labor1);
        manager.addResource(material1);

    // Display resources
        System.out.println("All Resources:");
        manager.viewResources();

    // Search for a resource
        System.out.println("\nSearch Resource ID 2:");
        Resource found = manager.searchResource(2);
        if (found != null) {
            System.out.println(found);}

    // Update a resource
        System.out.println("\nUpdate Resource ID 1:");
        manager.updateResource(1, "Excavator", "Hour", 155.00, true);
        manager.viewResources();

    // Calculate estimated cost
        System.out.println("\nEstimated Cost:");
        double total = manager.calculateCost(1, 8);
        System.out.printf("8 hours of Excavator: $%.2f%n", total);

    // Remove a resource
        System.out.println("\nRemove Resource ID 3:");
        manager.removeResource(3);
        manager.viewResources();
    }
}
