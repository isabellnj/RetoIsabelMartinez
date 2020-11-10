package com.example.RetoIsabelMS.MODEL;

public class Product{

    public Product(){}

    private static int count=0;
    private int id; 
    private String Name; 
    private int Precio; 
    private String Image;

    public Product(final int _id, final String _name, final int _precio, final String _image){
       
        this.id = count++;
        this.Name = _name;
        this.Precio = _precio;
        this.Image = _image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    

    
}
