/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Pham Quang Thanh - CE171732
 */
public class Categories {
    private  int CateID ;
    private String CateName ;
    private String CateDescription ;
    private int CateStatus ;

    public Categories() {
    }

    public Categories(int CateID, String CateName, String CateDescription, int CateStatus) {
        this.CateID = CateID;
        this.CateName = CateName;
        this.CateDescription = CateDescription;
        this.CateStatus = CateStatus;
    }

    public int getCateID() {
        return CateID;
    }

    public void setCateID(int CateID) {
        this.CateID = CateID;
    }

    public String getCateName() {
        return CateName;
    }

    public void setCateName(String CateName) {
        this.CateName = CateName;
    }

    public String getCateDescription() {
        return CateDescription;
    }

    public void setCateDescription(String CateDescription) {
        this.CateDescription = CateDescription;
    }

    public int getCateStatus() {
        return CateStatus;
    }

    public void setCateStatus(int CateStatus) {
        this.CateStatus = CateStatus;
    }
    
}
