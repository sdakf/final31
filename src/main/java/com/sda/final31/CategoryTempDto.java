package com.sda.final31;

import lombok.Getter;

@Getter
public class CategoryTempDto {
    private Long id;
    private String categoryName;
    private Long parentId;
    private Long depth;
    private static Long counter = 0L;

    public static CategoryTempDto fromLine(String line) {
        String[] split = line.split("\\w+");
        String firstElement = split[0];
        int depth = firstElement.length();
        CategoryTempDto categoryTempDto = new CategoryTempDto();
        categoryTempDto.depth = Long.valueOf(depth);
        categoryTempDto.categoryName = line.trim();
        categoryTempDto.id = counter++;
        return categoryTempDto;
    }
}
