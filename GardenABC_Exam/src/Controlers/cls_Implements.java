/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

/**
 *
 * @author Poli
 */
public class cls_Implements {
    private String id;
    private String name;
    private int type;
    private String Description;

    public cls_Implements(String id, String name, int type, String Description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.Description = Description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public String getDescription() {
        return Description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
