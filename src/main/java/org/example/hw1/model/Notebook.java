package org.example.hw1.model;

public class Notebook {
    private String manufacturer;
    private String name;
    private Double screenSize;
    private Integer memory;
    private Integer hdd;
    private String os;

    public Notebook(String manufacturer, String name, Double screenSize, Integer memory, Integer hdd, String os) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.screenSize = screenSize;
        this.memory = memory;
        this.hdd = hdd;
        this.os = os;
    }

    @Override
    public String toString() {
        return  manufacturer + "\\" + name + "\\" + screenSize + "\\RAM:" + memory + "Gb\\HDD:" + hdd + "Gb\\OS:" + os;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public Integer getMemory() {
        return memory;
    }

    public Integer getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }
}