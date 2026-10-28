/***********************************************************
 * Name: Lacey Roof
 * Assignment: FieldLedger - Resource Manager -  Class Implementation
 *
 * Child class for equipment. Inherits Resource class
 */
public class Equipment extends Resource {

public Equipment (int resourceId, String name, String unit, double unitCost, boolean active){
    super(resourceId, name, unit, unitCost, active);}

@Override 
public String toString() {
    return "Equipment | " + super.toString();
    }    
}