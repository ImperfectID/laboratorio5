package com.jorgeazzufranco.laboratorio5;

/**
 * Created by uca on 04-17-18.
 */

public class Serie {
    private String name;
    private String caps;
    private int img;
    private String desc;

    public Serie(String name, String caps, int img, String desc) {
        this.name = name;
        this.caps = caps;
        this.img = img;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaps() {
        return caps;
    }

    public void setCaps(String caps) {
        this.caps = caps;
    }

    public  int getImg(){
        return img;
    }

    public void setImg(int img){
        this.img = img;
    }

    public String getDesc(String desc){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }
}