/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Pham Quang Thanh - CE171732
 */
public class Brands {

    private int BrandID;
    private String BrandName;
    private int BrandStatus;

    public Brands() {
    }

    public Brands(int BrandID, String BrandName, int BrandStatus) {
        this.BrandID = BrandID;
        this.BrandName = BrandName;
        this.BrandStatus = BrandStatus;
    }

    public int getBrandID() {
        return BrandID;
    }

    public void setBrandID(int BrandID) {
        this.BrandID = BrandID;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public int getBrandStatus() {
        return BrandStatus;
    }

    public void setBrandStatus(int BrandStatus) {
        this.BrandStatus = BrandStatus;
    }

}
