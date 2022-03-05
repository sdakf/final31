package com.sda.final31.finalapp.categories;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryDto {
    private Long id;
    private String categoryName;
    private Long parentId;
    private CategoryState state;

    public String getParent() { //o tym marzą frontendowcy
        return parentId == null ? "#" : parentId.toString();
    }

    public String getText() {
        return id + ". " + categoryName;
    }
}

@Setter
@Getter
class CategoryState {
    boolean opened;
    boolean selected;
}
