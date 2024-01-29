/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Pham Quang Thanh - CE171732
 */
public class Products {

    private int ProductID;
    private String ProName;
    private String Description;
    private float Price;
    private int Quantity;
    private int Size;
    private  String Image ;
    private int CateID;
    private int BrandID;
    private String Color;
    private int ProStatus;
    private int Sold;

    public Products() {
    }

    public Products(int ProductID, String ProName, String Description, float Price, int Quantity, int Size, String Image, int CateID, int BrandID, String Color, int ProStatus, int Sold) {
        this.ProductID = ProductID;
        this.ProName = ProName;
        this.Description = Description;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Size = Size;
        this.Image = Image;
        this.CateID = CateID;
        this.BrandID = BrandID;
        this.Color = Color;
        this.ProStatus = ProStatus;
        this.Sold = Sold;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProName() {
        return ProName;
    }

    public void setProName(String ProName) {
        this.ProName = ProName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public int getCateID() {
        return CateID;
    }

    public void setCateID(int CateID) {
        this.CateID = CateID;
    }

    public int getBrandID() {
        return BrandID;
    }

    public void setBrandID(int BrandID) {
        this.BrandID = BrandID;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getProStatus() {
        return ProStatus;
    }

    public void setProStatus(int ProStatus) {
        this.ProStatus = ProStatus;
    }

    public int getSold() {
        return Sold;
    }

    public void setSold(int Sold) {
        this.Sold = Sold;
    }

    
    
    
    
}
