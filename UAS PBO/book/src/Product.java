/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jokos
 */
public class Product extends Item{
    
    public Product(int id,String title, String category, int quantity, String status){
        this.id = id;
        this.title = title;
        this.category = category;
        this.quantity = quantity;
        this.status = status;
    }
    public Product(String title, String category, int quantity, String status){
        this.title = title;
        this.category = category;
        this.quantity = quantity;
        this.status = status;
    }
    
    @Override
    public void setId(int id){
        this.id =id;
    }
    @Override
    public void setTitle(String title){
        this.title = title;
    }
    @Override
    public void setCategory(String category){
        this.category = category;
    }
    @Override
    public void setStatus(String status){
        this.status = status;
    }
    @Override
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    
    @Override
    public int getId(){
        return id;
    }
    @Override
    public String getTitle(){
        return title;
    }
    @Override
    public String getCategory(){
        return category;
    }
    @Override
    public String getStatus(){
        return status;
    }
    @Override
    public int getQuantity(){
        return quantity;
    }
}
