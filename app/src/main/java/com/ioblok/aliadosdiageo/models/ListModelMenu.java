package com.ioblok.aliadosdiageo.models;

/**
 * Created by kreativeco on 27/03/16.
 */
public class ListModelMenu {

    private String nameList;
    private int colorItem;

    public ListModelMenu (String nameList, int colorItem){
        this.nameList = nameList;
        this.colorItem = colorItem;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public int getColorItem() {
        return colorItem;
    }

    public void setColorItem(int colorItem) {
        this.colorItem = colorItem;
    }
}
