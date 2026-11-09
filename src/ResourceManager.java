/***********************************************************
 * Name: Lacey Roof
 * Assignment: FieldLedger - Resource Manager - Class Implementation
 *
 * Implements interface methods
 */
import java.util.ArrayList;

    //provide methods defined from interface & declares list that can hold objects
public class ResourceManager implements ResourceOperations {
    private ArrayList<Resource> resources;
 
    //Constructor - create empty list for object
public ResourceManager() {
    resources = new ArrayList<Resource>();}
    
    //Implement first method - Add Resource
@Override 
public void addResource(Resource resource) {
    resources.add(resource);}

    //Implement second method - View Resource
@Override 
public void viewResources() {
    for (Resource resource : resources) {
        System.out.println(resource);}}
 //Implement third method - Search Resource by ID
@Override
public Resource searchResource(int resourceId) {
    for (Resource resource : resources) {
        if (resource.getResourceId() == resourceId) {
            return resource;}}
    return null;}

    //Implement fourth method - Update Resource
@Override
public boolean updateResource(int resourceId, String name, String unit, double unitCost, boolean active) {
    Resource resource = searchResource(resourceId);
    if (resource != null) {
        resource.setName(name);
        resource.setUnit(unit);
        resource.setUnitCost(unitCost);
        resource.setActive(active);
        return true;}
    return false;}

    //Implement fifth method - Remove Resource
@Override
public boolean removeResource(int resourceId) {
    Resource resource = searchResource(resourceId);
    if (resource != null) {
        resources.remove(resource);
        return true;}
    return false;}

    //Calculate estimated resource cost
public double calculateCost(int resourceId, double quantity) {
    Resource resource = searchResource(resourceId);
    if (resource != null && quantity >= 0) {
        return resource.getUnitCost() * quantity;}
    return 0;}
    }