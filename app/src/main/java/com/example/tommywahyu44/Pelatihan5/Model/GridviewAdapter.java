package com.example.tommywahyu44.Pelatihan5.Model;

/**
 * Created by Fauziw97 on 9/15/17.
 */

public class GridviewAdapter {

    private String kriteriaImage;
    private String kriteriaName;


    public GridviewAdapter(String kriteriaImage, String kriteriaName ) {
        this.kriteriaImage = kriteriaImage;
        this.kriteriaName = kriteriaName;
    }

    public String getKriteriaImage() {
        return kriteriaImage;
    }

    public String getKriteriaName() {
        return kriteriaName;
    }

    public void setKriteriaImage(String kriteriaImage) {
        this.kriteriaImage = kriteriaImage;
    }

    public void setKriteriaName(String kriteriaName) {
        this.kriteriaName = kriteriaName;
    }
}
