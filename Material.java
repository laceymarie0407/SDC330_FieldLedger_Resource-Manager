/***********************************************************
 * Name: Lacey Roof
 * Assignment: FieldLedger - Resource Manager -  Class Implementation
 *
 * Child class for material. Inherits Resource class
 */
public class Material extends Resource {

public Material (int resourceId, String name, String unit, double unitCost, boolean active){
    super(resourceId, name, unit, unitCost, active);}

@Override 
public String toString() {
    return "Material | " + super.toString();
    }    
}