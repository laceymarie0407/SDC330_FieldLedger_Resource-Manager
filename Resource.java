/***********************************************************
 * Name: Lacey Roof
 * Assignment: FieldLedger - Resource Manager -  Class Implementation
 *
 * Abstract parent class for equipment, labor, and materials.
 */
public abstract class Resource {
    private int resourceId;
    private String name;
    private String unit;
    private double unitCost;
    private boolean active;

    // Constructor
    public Resource(int resourceId, String name, String unit, double unitCost, boolean active) {
        this.resourceId = resourceId;
        this.name = name;
        this.unit = unit;
        this.unitCost = unitCost;
        this.active = active;
    }

    // Getters & Setters
    public int getResourceId() {
        return resourceId;}    
        
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    
    public String getUnit() {
        return unit;}
    public void setUnit(String unit) {
        this.unit = unit;}
    
    public double getUnitCost() {
        return unitCost;}
    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;}
    
    public boolean isActive() {
        return active;}
    public void setActive(boolean active) {
        this.active = active;}

    // Display resource information
    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Unit: %s | Cost: $%.2f | Active: %b",
            resourceId, name, unit, unitCost, active);}
}
