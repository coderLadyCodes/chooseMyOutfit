package com.samia.chooseMyOutfit;

import javax.persistence.*;

@Entity
@Table(name="outfits")
public class Outfits {
    public enum Thikness{
        hot, normal, cold
    }

    public enum Cloths{
        top, bottom, shoes
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "comfy", nullable = false)
    private Boolean comfy;

    @Column(name = "chic", nullable = false)
    private Boolean chic;

    @Column(name = "thikness", nullable = false)
    private Thikness thikness;

    @Column(name = "cloths", nullable = false)
    private Cloths cloths;


    public Outfits() {
    }
}
