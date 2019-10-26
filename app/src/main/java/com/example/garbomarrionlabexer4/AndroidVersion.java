package com.example.garbomarrionlabexer4;

public class AndroidVersion {
    private int logo;
    private String com, coun, ind, ceo;


    public AndroidVersion(int logo, String com1, String s, String com, String coun) {
        this.logo = logo;
        this.com = com;
        this.coun = coun;
        this.ind = coun;
        this.ceo = coun;
    }

    public int getLogo() {
        return logo;
    }

    public String getName() {
        return com;
    }

    public String getCoun() {
        return coun;
    }

    public String getInd() {
        return ind;
    }

    public String getCeo() {
        return ceo;
    }

}

