package com.sda.final31.finalapp.categories;

import lombok.Getter;

@Getter
public class Category {
    private Long id;
    private String categoryName;
    private Long parentId;

    public Category(Long id, String categoryName, Long parentId) {
        this.id = id;
        this.categoryName = categoryName;
        this.parentId = parentId;
    }
}
