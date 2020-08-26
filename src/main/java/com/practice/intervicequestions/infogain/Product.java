package com.practice.intervicequestions.infogain;


import java.util.Map;

class Product {

    private String name;
    private String category;
    private int price;
    private Map<String, String> features;

    public Product(String name, String category, int price, Map<String, String> features) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public Map<String, String> getFeatures() {
        return features;
    }
}
