/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jokos
 */
abstract class Item {
    protected int id;
    protected String title;
    protected String category;;
    protected String status;
    protected int quantity;
    abstract void setId(int id);;
    abstract void setTitle(String title);;
    abstract void setCategory(String category);
    abstract void setStatus(String status);
    abstract void setQuantity(int quantity);
    
    
    abstract int getId();;
    abstract String getTitle();;
    abstract String getCategory();;
    abstract String getStatus();
    abstract int getQuantity();
    
}
