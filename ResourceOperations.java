/***********************************************************
 * Name: Lacey Roof
 * Assignment: FieldLedger - Resource Manager - Class Implementation
 *
 * Interface defining resource management operations.
 */
public interface ResourceOperations {

    // Add a new resource
    void addResource(Resource resource);

    // Display all resources
    void viewResources();

    // Find a resource by ID
    Resource searchResource(int resourceId);

    // Update an existing resource
    boolean updateResource(int resourceId, String name, String unit,
        double unitCost, boolean active);

    // Remove a resource by ID
    boolean removeResource(int resourceId);
}
