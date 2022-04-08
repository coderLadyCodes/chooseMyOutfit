package com.samia.chooseMyOutfit;

import javax.persistence.*;

@Entity
@Table(name="outfits", indexes = {
        @Index(columnList = "name"),
        @Index(columnList = "color"),
        @Index(columnList = "photo_link"),
        @Index(columnList = "comfy"),
        @Index(columnList = "chic"),
        @Index(columnList = "thikness"),
        @Index(columnList = "cloths"),
        @Index(columnList = "shape"),
})

public class Outfit {

    public enum Thikness{
        hot, normal, cold
    }

    public enum Cloths{
        top, bottom, shoes
    }

    public enum Shape{
        loose, normal, tight
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "photo_link", nullable = false)
    private String photoLink;

    @Column(name = "comfy", nullable = false)
    private boolean comfy;

    @Column(name = "chic", nullable = false)
    private boolean chic;

    @Column(name = "thikness", nullable = false)
    private Thikness thikness;

    @Column(name = "cloths", nullable = false)
    private Cloths cloths;


    @Column(name = "shape", nullable = false)
    private Shape shape;

    public Outfit() {
    }

    public Outfit(String name, String color, String photoLink, boolean comfy, boolean chic, Thikness thikness, Cloths cloths, Shape shape) {
        this.name = name;
        this.color = color;
        this.photoLink = photoLink;
        this.comfy = comfy;
        this.chic = chic;
        this.thikness = thikness;
        this.cloths = cloths;
        this.shape = shape;
    }

    public Outfit(Long id, String name, String color, String photoLink, boolean comfy, boolean chic, Thikness thikness, Cloths cloths, Shape shape) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.photoLink = photoLink;
        this.comfy = comfy;
        this.chic = chic;
        this.thikness = thikness;
        this.cloths = cloths;
        this.shape = shape;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public boolean isComfy() {
        return comfy;
    }

    public void setComfy(boolean comfy) {
        this.comfy = comfy;
    }

    public boolean isChic() {
        return chic;
    }

    public void setChic(boolean chic) {
        this.chic = chic;
    }

    public Thikness getThikness() {
        return thikness;
    }

    public void setThikness(Thikness thikness) {
        this.thikness = thikness;
    }

    public Cloths getCloths() {
        return cloths;
    }

    public void setCloths(Cloths cloths) {
        this.cloths = cloths;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Outfits{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", photoLink='" + photoLink + '\'' +
                ", comfy=" + comfy +
                ", chic=" + chic +
                ", thikness=" + thikness +
                ", cloths=" + cloths +
                ", shape=" + shape +
                '}';
    }
}
