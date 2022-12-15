package com.edavud.forever_31_finalproject.controller.dto;

public class ProductDto {
    private String name;
    private String description;
    private String imgUrl;

    private String createdAt;

    public ProductDto(String name, String description, String imgUrl, String createdAt) {
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
