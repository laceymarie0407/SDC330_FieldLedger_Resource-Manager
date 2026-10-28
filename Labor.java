/***********************************************************
 * Name: Lacey Roof
 * Assignment: FieldLedger - Resource Manager -  Class Implementation
 *
 * Child class for labor. Inherits Resource class
 */
public class Labor extends Resource {

public Labor (int resourceId, String name, String unit, double unitCost, boolean active){
    super(resourceId, name, unit, unitCost, active);}

@Override 
public String toString() {
    return "Labor | " + super.toString();
    }    
}