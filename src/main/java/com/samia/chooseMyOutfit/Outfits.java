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

public class Outfits {

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

    public Outfits() {
    }
}
