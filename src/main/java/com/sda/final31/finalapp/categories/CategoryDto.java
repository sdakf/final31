package com.sda.final31.finalapp.categories;

public class CategoryDto {
    private Long id;
    private String categoryName;
    private Long parentId;
    private CategoryState state;

    class CategoryState{
        boolean opened;
        boolean selected;
    }
}
